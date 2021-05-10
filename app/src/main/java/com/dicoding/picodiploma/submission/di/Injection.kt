package com.dicoding.picodiploma.submission.di

import android.content.Context
import com.dicoding.picodiploma.submission.data.Repository
import com.dicoding.picodiploma.submission.data.source.remote.RemoteDataSource

object Injection {
    fun provideRepository(context: Context): Repository {
        val remoteDataSource = RemoteDataSource.getInstance()
        return Repository.getInstance(remoteDataSource)
    }
}