package com.dicoding.picodiploma.submission.ui.fragment

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import com.dicoding.picodiploma.submission.data.Repository
import com.dicoding.picodiploma.submission.data.source.local.entity.DataEntity
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

@RunWith(MockitoJUnitRunner::class)
class ContentViewModelTest {

    private lateinit var viewModel: ContentViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repository: Repository

    @Mock
    private lateinit var observer: Observer<List<DataEntity>>

    @Before
    fun setUp() {
        viewModel= ContentViewModel(repository)
    }

    @Test
    fun getMovies() {
        val dummyMovie = DataDummy.generateDummyMovies()
        val movies = MutableLiveData<List<DataEntity>>()
        movies.value = dummyMovie

        `when`(repository.getMovies()).thenReturn(movies)
        val movie = viewModel.getMovies().value
        verify(repository).getMovies()

        assertNotNull(movie)
        assertEquals(3, movie?.size)

        viewModel.getMovies().observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }

    @Test
    fun getTvShows() {
        val dummyTvShow = DataDummy.generateDummyTvShows()
        val tvShows = MutableLiveData<List<DataEntity>>()
        tvShows.value = dummyTvShow

        `when`(repository.getTvShows()).thenReturn(tvShows)
        val tvShow = viewModel.getTvShows().value
        verify(repository).getTvShows()

        assertNotNull(tvShow)
        assertEquals(3, tvShow?.size)

        viewModel.getTvShows().observeForever(observer)
        verify(observer).onChanged(dummyTvShow)
    }
}