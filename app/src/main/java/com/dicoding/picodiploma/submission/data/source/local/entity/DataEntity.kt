package com.dicoding.picodiploma.submission.data.source.local.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataEntity(
    var id: String,
    var title: String,
    var release: String,
    var duration: String,
    var poster: String,
    var genre: String,
    var rated: String,
    var overview: String,
    var favorite: Boolean = false,
    var rating: String
) : Parcelable
