package com.dicoding.picodiploma.submission.ui.fragment.favorite.movies

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.submission.data.Repository
import com.dicoding.picodiploma.submission.data.source.local.entity.MovieEntity

class FavoriteMovieViewModel(private val repository: Repository) : ViewModel() {
    fun getFavMovies() = repository.getFavoriteMovies()

    fun setFavMovie(movieEntity: MovieEntity) {
        val newState = !movieEntity.favorite
        repository.setFavoriteMovie(movieEntity, newState)
    }
}