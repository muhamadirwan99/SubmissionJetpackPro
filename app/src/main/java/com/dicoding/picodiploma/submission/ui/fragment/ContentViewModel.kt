package com.dicoding.picodiploma.submission.ui.fragment

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity
import com.dicoding.picodiploma.submission.utils.DataDummy

class ContentViewModel : ViewModel() {

    fun getMovies() : List<DataEntity> = DataDummy.generateDummyMovies()

    fun getTvShows() : List<DataEntity> = DataDummy.generateDummyTvShows()
}