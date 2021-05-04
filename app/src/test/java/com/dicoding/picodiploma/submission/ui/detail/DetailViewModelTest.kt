package com.dicoding.picodiploma.submission.ui.detail

import com.dicoding.picodiploma.submission.utils.DataDummy
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private val dummyMovie = DataDummy.generateDummyMovies()[0]
    private val dummyTvShow = DataDummy.generateDummyTvShows()[0]
    private val movieId = dummyMovie.id
    private val tvShowId = dummyTvShow.id

    @Before
    fun setUp() {
        viewModel = DetailViewModel()
        viewModel.setSelectedMovie(movieId)
        viewModel.setSelectedTvShow(tvShowId)
    }

    @Test
    fun getMovie() {
        val movie = viewModel.getMovie()
        assertNotNull(movie)
        assertEquals(dummyMovie.title, movie.title)
        assertEquals(dummyMovie.release, movie.release)
        assertEquals(dummyMovie.duration, movie.duration)
        assertEquals(dummyMovie.genre, movie.genre)
        assertEquals(dummyMovie.rated, movie.rated)
        assertEquals(dummyMovie.rating, movie.rating)
        assertEquals(dummyMovie.overview, movie.overview)
        assertEquals(dummyMovie.poster, movie.poster)
    }

    @Test
    fun getTvShow() {
        val tvShow = viewModel.getTvShow()
        assertNotNull(tvShow)
        assertEquals(dummyTvShow.title, tvShow.title)
        assertEquals(dummyTvShow.release, tvShow.release)
        assertEquals(dummyTvShow.duration, tvShow.duration)
        assertEquals(dummyTvShow.genre, tvShow.genre)
        assertEquals(dummyTvShow.rated, tvShow.rated)
        assertEquals(dummyTvShow.rating, tvShow.rating)
        assertEquals(dummyTvShow.overview, tvShow.overview)
        assertEquals(dummyTvShow.poster, tvShow.poster)
    }
}