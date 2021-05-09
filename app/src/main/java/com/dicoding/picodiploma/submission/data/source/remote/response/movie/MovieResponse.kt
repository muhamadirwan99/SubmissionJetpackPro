package com.dicoding.picodiploma.submission.data.source.remote.response.movie

import com.google.gson.annotations.SerializedName

data class MovieResponse(

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("title")
	val title: String,

	@field:SerializedName("release_date")
	val releaseDate: String,

	@field:SerializedName("poster_path")
	val posterPath: String,

	@field:SerializedName("overview")
	val overview: String,

	@field:SerializedName("vote_average")
	val voteAverage: Double,

)

