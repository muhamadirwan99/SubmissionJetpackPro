package com.dicoding.picodiploma.submission.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movieentities")
data class MovieEntity(
    @PrimaryKey
    @NonNull

    @ColumnInfo(name = "id")
    var id: String,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "release")
    var release: String,

    @ColumnInfo(name = "duration")
    var duration: Int?,

    @ColumnInfo(name = "poster")
    var poster: String,

    @ColumnInfo(name = "genres")
    var genre: String,

    @ColumnInfo(name = "status")
    var status: String?,

    @ColumnInfo(name = "overview")
    var overview: String,

    @ColumnInfo(name = "favorite")
    var favorite: Boolean = false,

    @ColumnInfo(name = "rating")
    var rating: Double
)
