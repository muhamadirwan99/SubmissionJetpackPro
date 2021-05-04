package com.dicoding.picodiploma.submission.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.picodiploma.submission.R
import com.dicoding.picodiploma.submission.data.DataEntity
import com.dicoding.picodiploma.submission.databinding.ActivityDetailBinding
import com.dicoding.picodiploma.submission.ui.fragment.movies.MoviesFragment.Companion.TYPE_MOVIE
import com.dicoding.picodiploma.submission.ui.fragment.tvshow.TvShowFragment.Companion.TYPE_TVSHOW

@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_DATA = "extra_data"
        const val EXTRA_TYPE = "extra_type"
    }

    private lateinit var binding: ActivityDetailBinding
    private lateinit var detail: DataEntity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[DetailViewModel::class.java]

        val id = intent.getStringExtra(EXTRA_DATA)
        val type = intent.getStringExtra(EXTRA_TYPE)

        if (type.equals(TYPE_MOVIE, ignoreCase = true)){
            viewModel.setSelectedMovie(id)
            detail = viewModel.getMovie()
        }else if (type.equals(TYPE_TVSHOW, ignoreCase = true)){
            viewModel.setSelectedTvShow(id)
            detail = viewModel.getTvShow()
        }

        with(binding){
            tvTitle.text = detail.title
            tvRelease.text = detail.release
            tvDuration.text = detail.duration
            tvGenre.text = detail.genre
            tvRated.text = detail.rated
            tvRating.text = detail.rating
            tvOverview.text = detail.overview

            Glide.with(this@DetailActivity)
                .load(detail.poster)
                .apply(
                    RequestOptions.placeholderOf(R.drawable.ic_loading)
                    .error(R.drawable.ic_error))
                .into(imgPoster)
        }

    }
}