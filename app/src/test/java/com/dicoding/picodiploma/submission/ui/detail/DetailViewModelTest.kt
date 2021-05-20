package com.dicoding.picodiploma.submission.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.dicoding.picodiploma.submission.data.Repository
import com.dicoding.picodiploma.submission.data.source.local.entity.MovieEntity
import com.dicoding.picodiploma.submission.data.source.local.entity.TvShowEntity
import com.dicoding.picodiploma.submission.ui.fragment.main.movies.MoviesFragment.Companion.TYPE_MOVIE
import com.dicoding.picodiploma.submission.ui.fragment.main.tvshow.TvShowFragment.Companion.TYPE_TVSHOW
import com.dicoding.picodiploma.submission.utils.DataDummy
import com.dicoding.picodiploma.submission.vo.Resource
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.verifyNoMoreInteractions
import org.junit.Test

import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovies()[0]
    private val dummyTvShow = DataDummy.generateDummyTvShows()[0]
    private val movieId = dummyMovie.id
    private val tvShowId = dummyTvShow.id

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repository: Repository

    @Mock
    private lateinit var observerMovie: Observer<Resource<MovieEntity>>

    @Mock
    private lateinit var observerTvShow: Observer<Resource<TvShowEntity>>

    @Before
    fun setUp() {
        viewModel = DetailViewModel(repository)
    }

    @Test
    fun getMovie() {
        val dummyDetailMovie = Resource.success(DataDummy.generateDummyDetailMovie())
        val movie = MutableLiveData<Resource<MovieEntity>>()
        movie.value = dummyDetailMovie

        `when`(repository.getDetailMovie(movieId)).thenReturn(movie)
        viewModel.setFilm(movieId, TYPE_MOVIE)

        viewModel.getDataDetailMovie().observeForever(observerMovie)
        verify(observerMovie).onChanged(dummyDetailMovie)
    }

    @Test
    fun setFavoriteMovie() {
        val dummyDetailMovie = Resource.success(DataDummy.generateDummyDetailMovie())
        val movie = MutableLiveData<Resource<MovieEntity>>()
        movie.value = dummyDetailMovie

        `when`(repository.getDetailMovie(movieId)).thenReturn(movie)

        viewModel.setFilm(movieId, TYPE_MOVIE)
        viewModel.setFavoriteMovie()
        verify(repository).setFavoriteMovie(movie.value!!.data as MovieEntity, true)
        verifyNoMoreInteractions(observerMovie)
    }

    @Test
    fun getTvShow() {
        val dummyDetailTvShow = Resource.success(DataDummy.generateDummyDetailTvShow())
        val tvShow = MutableLiveData<Resource<TvShowEntity>>()
        tvShow.value = dummyDetailTvShow

        `when`(repository.getDetailTvShow(tvShowId)).thenReturn(tvShow)
        viewModel.setFilm(tvShowId, TYPE_TVSHOW)

        viewModel.getDataDetailTvShow().observeForever(observerTvShow)
        verify(observerTvShow).onChanged(dummyDetailTvShow)
    }
}