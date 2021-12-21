package com.leandro.desafio_mobile.repositories

import androidx.lifecycle.LiveData
import com.leandro.desafio_mobile.data.entity.MovieEntity
import com.leandro.desafio_mobile.data.local.MoviesListResponse
import com.leandro.desafio_mobile.utils.Resource

interface MovieRepository {

    suspend fun getMovies(): Resource<MoviesListResponse>

    suspend fun saveMovie(movie: MovieEntity): Long

    fun getAllMoviesSaved(): LiveData<List<MovieEntity>?>

    suspend fun deleteMovie(idDatabase: Int)
}