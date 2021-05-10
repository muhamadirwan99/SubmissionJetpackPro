package com.dicoding.picodiploma.submission.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity
import com.dicoding.picodiploma.submission.data.source.remote.RemoteDataSource
import com.dicoding.picodiploma.submission.data.source.remote.response.movie.Movie
import com.dicoding.picodiploma.submission.data.source.remote.response.movie.MovieDetailResponse
import com.dicoding.picodiploma.submission.data.source.remote.response.movie.MovieResponse
import com.dicoding.picodiploma.submission.data.source.remote.response.tvshow.TvShow
import com.dicoding.picodiploma.submission.data.source.remote.response.tvshow.TvShowDetailResponse

class FakeRepository (private val remoteDataSource: RemoteDataSource): DataSource{

    override fun getMovies(): LiveData<List<DataEntity>> {
        val movieResult = MutableLiveData<List<DataEntity>>()

        remoteDataSource.getMovies(object : RemoteDataSource.LoadMoviesCallback{
            override fun onMoviesLoaded(movies: List<Movie>?) {
                val movieList = ArrayList<DataEntity>()

                if (movies != null){
                    for (response in movies) {
                        with(response) {
                            val movie = DataEntity(id.toString(), title, releaseDate, null, posterPath, null, null, overview, null, voteAverage)
                            movieList.add(movie)
                        }
                    }
                    movieResult.postValue(movieList)
                }
            }
        })
        return movieResult
    }

    override fun getDetailMovie(movieId: String): LiveData<DataEntity> {
        val movieDetailResult = MutableLiveData<DataEntity>()

        remoteDataSource.getDetailMovie(object : RemoteDataSource.LoadDetailMovieCallback{
            override fun onDetailMovieLoaded(movieDetail: MovieDetailResponse?) {
                if (movieDetail != null) {
                    with(movieDetail) {
                        val listGenre = ArrayList<String>()

                        for (genre in genres) {
                            listGenre.add(genre.name)
                        }

                        val detailMovie = DataEntity(id.toString(), title, releaseDate, runtime, posterPath, listGenre, status, overview, null, voteAverage)
                        movieDetailResult.postValue(detailMovie)
                    }
                }
            }
        }, movieId)
        return movieDetailResult
    }

    override fun getTvShows(): LiveData<List<DataEntity>> {
        val tvShowResult = MutableLiveData<List<DataEntity>>()

        remoteDataSource.getTvShows(object : RemoteDataSource.LoadTvShowsCallback{
            override fun onTvShowsLoaded(tvShows: List<TvShow>?) {
                val tvShowList = ArrayList<DataEntity>()

                if (tvShows != null) {
                    for (response in tvShows) {
                        with(response) {
                            val tvShow = DataEntity(id.toString(), name, firstAirDate, null, posterPath, null, null, overview, null, voteAverage)
                            tvShowList.add(tvShow)
                        }
                    }
                    tvShowResult.postValue(tvShowList)
                }
            }
        })
        return tvShowResult
    }

    override fun getDetailTvShow(tvShowId: String): LiveData<DataEntity> {
        val tvShowResult = MutableLiveData<DataEntity>()

        remoteDataSource.getDetailTvShow(object : RemoteDataSource.LoadDetailTvShowCallback{
            override fun onDetailTvShowLoaded(tvShowDetail: TvShowDetailResponse?) {
                if (tvShowDetail != null) {
                    with(tvShowDetail) {
                        val listGenre = ArrayList<String>()

                        for (genre in genres) {
                            listGenre.add(genre.name)
                        }


                        val detailTvShow = DataEntity(id.toString(), name, firstAirDate, episodeRunTime[0], posterPath, listGenre, status, overview, null, voteAverage)
                        tvShowResult.postValue(detailTvShow)
                    }
                }
            }
        }, tvShowId)
        return tvShowResult
    }
}