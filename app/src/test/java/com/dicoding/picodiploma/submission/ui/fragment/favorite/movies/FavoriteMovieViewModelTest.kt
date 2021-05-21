package com.dicoding.picodiploma.submission.ui.fragment.favorite.movies

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.dicoding.picodiploma.submission.data.Repository
import com.dicoding.picodiploma.submission.data.source.local.entity.MovieEntity
import com.dicoding.picodiploma.submission.utils.DataDummy
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.verifyNoMoreInteractions
import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.`when`
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class FavoriteMovieViewModelTest{
    private lateinit var viewModel: FavoriteMovieViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var repository: Repository

    @Mock
    private lateinit var observer: Observer<PagedList<MovieEntity>>

    @Mock
    private lateinit var pagedList: PagedList<MovieEntity>

    @Before
    fun setUp() {
        viewModel = FavoriteMovieViewModel(repository)
    }

    @Test
    fun getFavMovies() {
        val dummyMovie = pagedList
        `when`(dummyMovie.size).thenReturn(3)
        val movies = MutableLiveData<PagedList<MovieEntity>>()
        movies.value = dummyMovie

        `when`(repository.getFavoriteMovies()).thenReturn(movies)
        val movie = viewModel.getFavMovies().value
        verify(repository).getFavoriteMovies()
        assertNotNull(movie)
        assertEquals(3, movie?.size)

        viewModel.getFavMovies().observeForever(observer)
        verify(observer).onChanged(dummyMovie)
    }

    @Test
    fun setFavMovie() {
        viewModel.setFavMovie(DataDummy.generateDummyDetailMovie())
        verify(repository).setFavoriteMovie(DataDummy.generateDummyDetailMovie(), true)
        verifyNoMoreInteractions(repository)
    }
}