package com.dicoding.picodiploma.submission.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.submission.data.Repository
import com.dicoding.picodiploma.submission.data.source.local.entity.MovieEntity
import com.dicoding.picodiploma.submission.data.source.local.entity.TvShowEntity
import com.dicoding.picodiploma.submission.ui.fragment.main.movies.MoviesFragment.Companion.TYPE_MOVIE
import com.dicoding.picodiploma.submission.ui.fragment.main.tvshow.TvShowFragment.Companion.TYPE_TVSHOW
import com.dicoding.picodiploma.submission.vo.Resource

class DetailViewModel(private val repository: Repository) : ViewModel() {

    private lateinit var detailDataMovie: LiveData<Resource<MovieEntity>>
    private lateinit var detailDataTvShow: LiveData<Resource<TvShowEntity>>

    fun setFilm(id: String, category: String) {
        when (category) {
            TYPE_MOVIE -> {
                detailDataMovie = repository.getDetailMovie(id)
            }
            TYPE_TVSHOW -> {
                detailDataTvShow = repository.getDetailTvShow(id)
            }
        }
    }

    fun setFavoriteMovie() {
        val resource = detailDataMovie.value
        if (resource?.data != null) {
            val newState = !resource.data.favorite
            repository.setFavoriteMovie(resource.data, newState)
        }
    }

    fun setFavoriteTvShow() {
        val resource = detailDataTvShow.value
        if (resource?.data != null) {
            val newState = !resource.data.favorite
            repository.setFavoriteTvShow(resource.data, newState)
        }
    }

    fun getDataDetailMovie() = detailDataMovie
    fun getDataDetailTvShow() = detailDataTvShow

}