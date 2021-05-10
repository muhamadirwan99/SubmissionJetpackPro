package com.dicoding.picodiploma.submission.ui.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.submission.data.Repository
import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity
import com.dicoding.picodiploma.submission.ui.fragment.movies.MoviesFragment.Companion.TYPE_MOVIE
import com.dicoding.picodiploma.submission.ui.fragment.tvshow.TvShowFragment.Companion.TYPE_TVSHOW
import com.dicoding.picodiploma.submission.utils.DataDummy

class DetailViewModel(private val repository: Repository) : ViewModel() {

    private lateinit var detailData: LiveData<DataEntity>

    fun setFilm(id: String, category: String) {
        when (category) {
            TYPE_MOVIE -> {
                detailData = repository.getDetailMovie(id)
            }
            TYPE_TVSHOW -> {
                detailData = repository.getDetailTvShow(id)
            }
        }
    }

    fun getDataDetail() = detailData

}