package com.dicoding.picodiploma.submission.ui.detail

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.submission.data.DataEntity
import com.dicoding.picodiploma.submission.utils.DataDummy

class DetailViewModel : ViewModel() {

    private lateinit var movieId : String
    private lateinit var tvShowId : String

    fun getMovies(): List<DataEntity> = DataDummy.generateDummyMovies() as ArrayList<DataEntity>

    fun getTvShows(): List<DataEntity> = DataDummy.generateDummyTvShows() as ArrayList<DataEntity>

    fun setSelectedMovie(movieId : String) {
        this.movieId = movieId
    }

    fun setSelectedTvShow(tvShowId : String) {
        this.tvShowId = tvShowId
    }

  fun getMovie(): DataEntity {
        lateinit var detail: DataEntity
        val listMovie = getMovies()
        for (movie in listMovie) {
            if (movie.id == movieId) {
                detail = movie
                break
            }
        }
        return detail
    }

    fun getTvShow(): DataEntity {
        lateinit var detail: DataEntity
        val listTvShow = getTvShows()
        for (tvShow in listTvShow) {
            if (tvShow.id == tvShowId) {
                detail = tvShow
                break
            }
        }
        return detail
    }

}