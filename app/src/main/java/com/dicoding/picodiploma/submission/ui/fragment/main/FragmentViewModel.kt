package com.dicoding.picodiploma.submission.ui.fragment.main

import androidx.lifecycle.ViewModel
import com.dicoding.picodiploma.submission.data.Repository

class FragmentViewModel(private val repository: Repository) : ViewModel() {

    fun getMovies() = repository.getMovies()

    fun getTvShows() = repository.getTvShows()
}