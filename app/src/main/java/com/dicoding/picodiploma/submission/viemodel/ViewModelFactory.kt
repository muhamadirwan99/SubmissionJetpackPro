package com.dicoding.picodiploma.submission.viemodel

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dicoding.picodiploma.submission.data.Repository
import com.dicoding.picodiploma.submission.di.Injection
import com.dicoding.picodiploma.submission.ui.detail.DetailViewModel
import com.dicoding.picodiploma.submission.ui.fragment.ContentViewModel

class ViewModelFactory private constructor(private val repository: Repository) : ViewModelProvider.NewInstanceFactory() {
    companion object {
        @Volatile
        private var instance: ViewModelFactory? = null

        fun getInstance(context: Context): ViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: ViewModelFactory(Injection.provideRepository(context))
            }
    }

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(ContentViewModel::class.java) -> {
                ContentViewModel(repository) as T
            }
            modelClass.isAssignableFrom(DetailViewModel::class.java) -> {
                DetailViewModel(repository) as T
            }
            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }

    }
}