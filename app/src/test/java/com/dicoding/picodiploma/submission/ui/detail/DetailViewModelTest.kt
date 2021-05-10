package com.dicoding.picodiploma.submission.ui.detail

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.dicoding.picodiploma.submission.data.Repository
import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity
import com.dicoding.picodiploma.submission.ui.fragment.movies.MoviesFragment.Companion.TYPE_MOVIE
import com.dicoding.picodiploma.submission.ui.fragment.tvshow.TvShowFragment.Companion.TYPE_TVSHOW
import com.dicoding.picodiploma.submission.utils.DataDummy
import com.nhaarman.mockitokotlin2.verify
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner
import java.util.*

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
    private lateinit var observer: Observer<DataEntity>

    @Before
    fun setUp() {
        viewModel = DetailViewModel(repository)
    }

    @Test
    fun getMovie() {
        val movie = MutableLiveData<DataEntity>()
        movie.value = dummyMovie

        `when`(repository.getDetailMovie(movieId)).thenReturn(movie)
        viewModel.setFilm(movieId, TYPE_MOVIE)
        val dataEntity = viewModel.getDataDetail().value as DataEntity
        verify(repository).getDetailMovie(movieId)

        assertNotNull(dataEntity)
        assertEquals(dummyMovie.id, dataEntity.id)
        assertEquals(dummyMovie.title, dataEntity.title)
        assertEquals(dummyMovie.release, dataEntity.release)
        assertEquals(dummyMovie.duration, dataEntity.duration)
        assertEquals(dummyMovie.genre, dataEntity.genre)
        assertEquals(dummyMovie.status, dataEntity.status)
        assertEquals(dummyMovie.rating.toInt(), dataEntity.rating.toInt())
        assertEquals(dummyMovie.overview, dataEntity.overview)
        assertEquals(dummyMovie.poster, dataEntity.poster)

        viewModel.getDataDetail().observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }

    @Test
    fun getTvShow() {
        val tvShow = MutableLiveData<DataEntity>()
        tvShow.value = dummyTvShow

        `when`(repository.getDetailTvShow(tvShowId)).thenReturn(tvShow)
        viewModel.setFilm(tvShowId, TYPE_TVSHOW)
        val dataEntity = viewModel.getDataDetail().value as DataEntity
        verify(repository).getDetailTvShow(tvShowId)

        assertNotNull(dataEntity)
        assertEquals(dummyTvShow.id, dataEntity.id)
        assertEquals(dummyTvShow.title, dataEntity.title)
        assertEquals(dummyTvShow.release, dataEntity.release)
        assertEquals(dummyTvShow.duration, dataEntity.duration)
        assertEquals(dummyTvShow.genre, dataEntity.genre)
        assertEquals(dummyTvShow.status, dataEntity.status)
        assertEquals(dummyTvShow.rating.toInt(), dataEntity.rating.toInt())
        assertEquals(dummyTvShow.overview, dataEntity.overview)
        assertEquals(dummyTvShow.poster, dataEntity.poster)

        viewModel.getDataDetail().observeForever(observer)
        verify(observer).onChanged(dummyTvShow)
    }
}