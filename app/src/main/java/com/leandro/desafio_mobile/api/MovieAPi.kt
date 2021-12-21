package com.leandro.desafio_mobile.api

import com.leandro.desafio_mobile.data.local.MoviesListResponse
import retrofit2.Response
import retrofit2.http.GET

interface MovieAPi {

    @GET("events/coming-soon/partnership/desafio")
    suspend fun getMovies(): Response<MoviesListResponse>
}