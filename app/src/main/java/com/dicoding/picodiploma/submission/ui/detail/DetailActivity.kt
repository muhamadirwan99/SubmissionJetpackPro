package com.dicoding.picodiploma.submission.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isInvisible
import androidx.core.view.isVisible
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.submission.R
import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity
import com.dicoding.picodiploma.submission.databinding.ActivityDetailBinding
import com.dicoding.picodiploma.submission.ui.fragment.movies.MoviesFragment.Companion.TYPE_MOVIE
import com.dicoding.picodiploma.submission.ui.fragment.tvshow.TvShowFragment.Companion.TYPE_TVSHOW
import com.dicoding.picodiploma.submission.utils.ApiInfo.IMAGE_URL
import com.dicoding.picodiploma.submission.viemodel.ViewModelFactory

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_TYPE = "extra_type"
    }

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        binding.progressBar.isVisible = true

        val factory = ViewModelFactory.getInstance(this)
        val viewModel = ViewModelProvider(this, factory)[DetailViewModel::class.java]

        val id = intent.getStringExtra(EXTRA_DATA)
        val type = intent.getStringExtra(EXTRA_TYPE)



        if (id != null && type != null){
            viewModel.setFilm(id, type)
            viewModel.getDataDetail().observe(this, { detail ->
                populateDataDetail(detail)
            })
        }

    }

    private fun populateDataDetail(detail: DataEntity){
        val genre = detail.genre.toString().replace("[", "").replace("]", "")
        val duration = resources.getString(R.string.minutes, detail.duration)

        with(binding){
            tvTitle.text = detail.title
            tvRelease.text = detail.release
            tvDuration.text = duration
            tvGenre.text = genre
            tvRated.text = detail.status
            tvRating.text = detail.rating.toString()
            tvOverview.text = detail.overview

            Glide.with(this@DetailActivity)
                .load(IMAGE_URL + detail.poster)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_loading)
                        .error(R.drawable.ic_error))
                .into(imgPoster)
        }

        binding.progressBar.isVisible = false

    }
}