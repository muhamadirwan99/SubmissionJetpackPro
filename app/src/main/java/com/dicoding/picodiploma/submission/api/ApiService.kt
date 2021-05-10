package com.dicoding.picodiploma.submission.api

import com.dicoding.picodiploma.submission.data.source.remote.response.movie.MovieDetailResponse
import com.dicoding.picodiploma.submission.data.source.remote.response.movie.MovieResponse
import com.dicoding.picodiploma.submission.data.source.remote.response.tvshow.TvShowDetailResponse
import com.dicoding.picodiploma.submission.data.source.remote.response.tvshow.TvShowResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("movie/popular")
    fun getMovies(
        @Query("api_key") apiKey: String
    ) : Call<MovieResponse>

    @GET("movie/{id}")
    fun getMovieDetail(
        @Path("id") id : String,
        @Query("api_key") apiKey: String
    ) : Call<MovieDetailResponse>

    @GET("tv/popular")
    fun getTvShows(
        @Query("api_key") apiKey: String
    ) : Call<TvShowResponse>

    @GET("tv/{id}")
    fun getTvShowDetail(
        @Path("id") id : String,
        @Query("api_key") apiKey: String
    ) : Call<TvShowDetailResponse>

}