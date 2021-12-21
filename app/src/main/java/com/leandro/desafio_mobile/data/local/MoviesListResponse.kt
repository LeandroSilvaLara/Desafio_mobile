package com.leandro.desafio_mobile.data.local

import com.google.gson.annotations.SerializedName
import com.leandro.desafio_mobile.data.models.MovieResponse

data class MoviesListResponse(
    @SerializedName("items")
    val movieResponses: List<MovieResponse>
)