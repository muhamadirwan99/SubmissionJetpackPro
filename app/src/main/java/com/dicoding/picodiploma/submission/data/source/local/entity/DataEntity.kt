package com.dicoding.picodiploma.submission.data.source.local.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataEntity(
    var id: String,
    var title: String,
    var release: String,
    var duration: Int?,
    var poster: String,
    var genre: List<String>?,
    var status: String?,
    var overview: String,
    var favorite: Boolean? = false,
    var rating: Double
) : Parcelable
