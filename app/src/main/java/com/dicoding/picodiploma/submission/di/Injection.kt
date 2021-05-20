package com.dicoding.picodiploma.submission.di

import android.content.Context
import com.dicoding.picodiploma.submission.data.Repository
import com.dicoding.picodiploma.submission.data.source.local.LocalDataSource
import com.dicoding.picodiploma.submission.data.source.local.room.DataDatabase
import com.dicoding.picodiploma.submission.data.source.remote.RemoteDataSource
import com.dicoding.picodiploma.submission.utils.AppExecutors

object Injection {
    fun provideRepository(context: Context): Repository {
        val database = DataDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance()
        val localDataSource = LocalDataSource.getInstance(database.dataDao())
        val appExecutors = AppExecutors()

        return Repository.getInstance(remoteDataSource, localDataSource, appExecutors)
    }
}