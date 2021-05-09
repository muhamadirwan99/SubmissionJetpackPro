package com.dicoding.picodiploma.submission.ui.fragment.movies

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity
import com.dicoding.picodiploma.submission.databinding.FragmentMoviesBinding
import com.dicoding.picodiploma.submission.ui.detail.DetailActivity
import com.dicoding.picodiploma.submission.ui.fragment.ContentAdapter
import com.dicoding.picodiploma.submission.ui.fragment.ContentCallback
import com.dicoding.picodiploma.submission.ui.fragment.ContentViewModel


class MoviesFragment : Fragment(), ContentCallback {

    companion object {
        const val TYPE_MOVIE = "type_movie"
    }

    private lateinit var binding: FragmentMoviesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMoviesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (activity != null) {
            val viewModel = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[ContentViewModel::class.java]
            val movie = viewModel.getMovies()

            val movieAdapter = ContentAdapter(this)
            movieAdapter.setContent(movie)

            with(binding.rvMovie) {
                layoutManager = LinearLayoutManager(context)
                setHasFixedSize(true)
                adapter = movieAdapter
            }
        }
    }

    override fun onItemClicked(data: DataEntity) {
        startActivity(
            Intent(context, DetailActivity::class.java)
                .putExtra(DetailActivity.EXTRA_DATA, data.id)
                .putExtra(DetailActivity.EXTRA_TYPE, TYPE_MOVIE)
        )
    }


}