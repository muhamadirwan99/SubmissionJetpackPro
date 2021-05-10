package com.dicoding.picodiploma.submission.ui.fragment

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.submission.data.Repository
import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity
import com.dicoding.picodiploma.submission.utils.DataDummy

class ContentViewModel(private val repository: Repository) : ViewModel() {

    fun getMovies() = repository.getMovies()

    fun getTvShows() = repository.getTvShows()
}