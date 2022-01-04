package com.leandro.desafio_mobile.utils

import com.leandro.desafio_mobile.data.remote.models.MovieResponse

interface OnMovieClickListener {
    fun onMovieClick(movieResponse: MovieResponse?)
}