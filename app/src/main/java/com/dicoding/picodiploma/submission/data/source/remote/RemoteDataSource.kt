package com.dicoding.picodiploma.submission.data.source.remote

import android.util.Log
import com.dicoding.picodiploma.submission.api.ApiConfig
import com.dicoding.picodiploma.submission.data.source.remote.response.movie.MovieDetailResponse
import com.dicoding.picodiploma.submission.data.source.remote.response.movie.MovieResponse
import com.dicoding.picodiploma.submission.data.source.remote.response.tvshow.TvShowDetailResponse
import com.dicoding.picodiploma.submission.data.source.remote.response.tvshow.TvShowResponse
import com.dicoding.picodiploma.submission.utils.ApiInfo.API_KEY
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RemoteDataSource {
    companion object {
        private const val TAG = "RemoteDataSource"

        @Volatile
        private var instance: RemoteDataSource? = null

        fun getInstance(): RemoteDataSource =
            instance ?: synchronized(this) {
                instance ?: RemoteDataSource()
            }
    }

    fun getMovies(callback: LoadMoviesCallback) {
        val client = ApiConfig.getApiService().getMovies(API_KEY)
        client.enqueue(object : Callback<MovieResponse> {
            override fun onResponse(call: Call<MovieResponse>, response: Response<MovieResponse>) {
                callback.onMoviesLoaded(response.body())
            }

            override fun onFailure(call: Call<MovieResponse>, t: Throwable) {
                Log.e(TAG, "getMovies onFailure: ${t.message.toString()}")
            }

        })

    }

    fun getDetailMovie(callback: LoadDetailMovieCallback, movieId: String){
        val client = ApiConfig.getApiService().getMovieDetail(movieId, API_KEY)
        client.enqueue(object : Callback<MovieDetailResponse>{
            override fun onResponse(
                call: Call<MovieDetailResponse>,
                response: Response<MovieDetailResponse>
            ) {
                callback.onDetailMovieLoaded(response.body())
            }

            override fun onFailure(call: Call<MovieDetailResponse>, t: Throwable) {
                Log.e(TAG, "getDetailMovie onFailure: ${t.message.toString()}")
            }
        })
    }

    fun getTvShows(callback: LoadTvShowsCallback) {
        val client = ApiConfig.getApiService().getTvShows(API_KEY)
        client.enqueue(object : Callback<TvShowResponse>{
            override fun onResponse(
                call: Call<TvShowResponse>,
                response: Response<TvShowResponse>
            ) {
                callback.onTvShowsLoaded(response.body())
            }

            override fun onFailure(call: Call<TvShowResponse>, t: Throwable) {
                Log.e(TAG, "getTvShows onFailure: ${t.message.toString()}")
            }

        })
    }

    fun getDetailTvShow(callback: LoadDetailTvShowCallback, tvId: String){
        val client = ApiConfig.getApiService().getTvShowDetail(tvId, API_KEY)
        client.enqueue(object : Callback<TvShowDetailResponse>{
            override fun onResponse(
                call: Call<TvShowDetailResponse>,
                response: Response<TvShowDetailResponse>
            ) {
                callback.onDetailTvShowLoaded(response.body())
            }

            override fun onFailure(call: Call<TvShowDetailResponse>, t: Throwable) {
                Log.e(TAG, "getDetailTvShow onFailure: ${t.message.toString()}")
            }

        })
    }

    interface LoadMoviesCallback {
        fun onMoviesLoaded(movies : MovieResponse?)
    }

    interface LoadDetailMovieCallback {
        fun onDetailMovieLoaded(movieDetail : MovieDetailResponse?)
    }

    interface LoadTvShowsCallback {
        fun onTvShowsLoaded(tvShows : TvShowResponse?)
    }

    interface LoadDetailTvShowCallback {
        fun onDetailTvShowLoaded(tvShowDetail: TvShowDetailResponse?)
    }
}


