package com.dicoding.picodiploma.submission.ui.fragment

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class ContentViewModelTest {

    private lateinit var viewModel: ContentViewModel

    @Before
    fun setUp() {
        viewModel= ContentViewModel()
    }

    @Test
    fun getMovies() {
        val contentEntities = viewModel.getMovies()
        assertNotNull(contentEntities)
        assertEquals(10, contentEntities.size)
    }

    @Test
    fun getTvShows() {
        val contentEntities = viewModel.getTvShows()
        assertNotNull(contentEntities)
        assertEquals(10, contentEntities.size)
    }
}