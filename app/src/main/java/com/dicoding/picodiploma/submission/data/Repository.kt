package com.dicoding.picodiploma.submission.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity
import com.dicoding.picodiploma.submission.data.source.remote.RemoteDataSource

class Repository private constructor(private val remoteDataSource: RemoteDataSource): DataSource{

    companion object {
        @Volatile
        private var instance: Repository? = null
        fun getInstance(remoteData: RemoteDataSource): Repository =
            instance ?: synchronized(this) {
                instance ?: Repository(remoteData)
            }
    }

    override fun getMovies(): LiveData<DataEntity> {
        val movieResult = MutableLiveData<DataEntity>()

        remoteDataSource.getMovies(object : RemoteDataSource.LoadMoviesCallback{
            override fun onMoviesLoaded(movies: MovieResponse?) {
                val movieList = ArrayList<DataEntity>()

                if (movies != null) {
                    with(movies) {
                        val movie = DataEntity(id, title, )
                    }
                }
            }

        })
    }

    override fun getDetailMovie(movieId: String): LiveData<DataEntity> {
        TODO("Not yet implemented")
    }

    override fun getTvShows(): LiveData<DataEntity> {
        TODO("Not yet implemented")
    }

    override fun getDetailTvShow(tvShowId: String): LiveData<DataEntity> {
        TODO("Not yet implemented")
    }

}