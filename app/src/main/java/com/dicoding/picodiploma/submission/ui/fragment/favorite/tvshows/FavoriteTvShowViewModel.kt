package com.dicoding.picodiploma.submission.ui.fragment.favorite.tvshows

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.submission.data.Repository
import com.dicoding.picodiploma.submission.data.source.local.entity.TvShowEntity

class FavoriteTvShowViewModel(private val repository: Repository) : ViewModel() {
    fun getFavTvShow() = repository.getFavoriteTvShows()

    fun setFavTvShow(tvShowEntity: TvShowEntity) {
        val newState = !tvShowEntity.favorite
        repository.setFavoriteTvShow(tvShowEntity, newState)
    }
}