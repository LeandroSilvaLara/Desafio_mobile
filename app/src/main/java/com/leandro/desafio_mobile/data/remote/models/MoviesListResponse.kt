package com.leandro.desafio_mobile.data.remote.models

import com.google.gson.annotations.SerializedName


data class MoviesListResponse(
    @SerializedName("items")
    val movieResponses: List<MovieResponse>
)