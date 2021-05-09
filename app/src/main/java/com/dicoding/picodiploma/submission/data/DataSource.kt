package com.dicoding.picodiploma.submission.data

import androidx.lifecycle.LiveData
import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity

interface DataSource {
    fun getMovies(): LiveData<List<DataEntity>>
    fun getDetailMovie(movieId: String): LiveData<DataEntity>
    fun getTvShows(): LiveData<List<DataEntity>>
    fun getDetailTvShow(tvShowId: String): LiveData<DataEntity>
}