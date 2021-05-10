package com.dicoding.picodiploma.submission.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.dicoding.picodiploma.submission.data.source.remote.RemoteDataSource
import com.dicoding.picodiploma.submission.utils.DataDummy
import com.dicoding.picodiploma.submission.utils.LiveDataTestUtil
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.doAnswer
import com.nhaarman.mockitokotlin2.eq
import com.nhaarman.mockitokotlin2.verify
import org.mockito.Mockito.mock
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule


class RepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = mock(RemoteDataSource::class.java)
    private val repository = FakeRepository(remote)

    private val moviesResponse = DataDummy.generateRemoteDummyMovies()
    private val movieId = moviesResponse[0].id.toString()
    private val movieDetail = DataDummy.generateRemoteDummyDetailMovie()

    private val tvShowsReponse = DataDummy.generateRemoteDummyTvShows()
    private val tvShowId = tvShowsReponse[0].id.toString()
    private val tvShowDetail = DataDummy.generateRemoteDummyDetailTvShow()

    @Test
    fun getMovies() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadMoviesCallback).onMoviesLoaded(moviesResponse)
            null
        }.`when`(remote).getMovies(any())

        val dataEntities = LiveDataTestUtil.getValue(repository.getMovies())
        verify(remote).getMovies(any())
        assertNotNull(dataEntities)
        assertEquals(moviesResponse.size, dataEntities.size)
    }

    @Test
    fun getDetailMovie() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadDetailMovieCallback).onDetailMovieLoaded(movieDetail)
            null
        }.`when`(remote).getDetailMovie(any(), eq(movieId))

        val dataEntity = LiveDataTestUtil.getValue(repository.getDetailMovie(movieId))
        verify(remote).getDetailMovie(any(), eq(movieId))
        assertNotNull(dataEntity)
        assertEquals(movieDetail.id.toString(), dataEntity.id)
    }

    @Test
    fun getTvShows() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadTvShowsCallback).onTvShowsLoaded(tvShowsReponse)
            null
        }.`when`(remote).getTvShows(any())

        val dataEntities = LiveDataTestUtil.getValue(repository.getTvShows())
        verify(remote).getTvShows(any())
        assertNotNull(dataEntities)
        assertEquals(tvShowsReponse.size, dataEntities.size)
    }

    @Test
    fun getDetailTvShow() {
        doAnswer { invocation ->
            (invocation.arguments[0] as RemoteDataSource.LoadDetailTvShowCallback).onDetailTvShowLoaded(tvShowDetail)
            null
        }.`when`(remote).getDetailTvShow(any(), eq(tvShowId))

        val dataEntity = LiveDataTestUtil.getValue(repository.getDetailTvShow(tvShowId))
        verify(remote).getDetailTvShow(any(), eq(tvShowId))
        assertNotNull(dataEntity)
        assertEquals(tvShowDetail.id.toString(), dataEntity.id)
    }
}