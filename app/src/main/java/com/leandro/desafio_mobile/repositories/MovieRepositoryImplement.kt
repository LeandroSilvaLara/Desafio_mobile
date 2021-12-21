package com.leandro.desafio_mobile.repositories

import com.leandro.desafio_mobile.api.MovieAPi
import com.leandro.desafio_mobile.data.database.MovieDatabase
import com.leandro.desafio_mobile.data.entity.MovieEntity
import com.leandro.desafio_mobile.data.local.MoviesListResponse
import com.leandro.desafio_mobile.utils.Resource
import javax.inject.Inject

class MovieRepositoryImplement @Inject constructor(
    private val api: MovieAPi,
    private val movieDatabase: MovieDatabase
) : MovieRepository {

    override suspend fun getMovies(): Resource<MoviesListResponse> {
        return try {
            val response = api.getMovies()
            if (response.isSuccessful) {
                response.body()?.let {
                    return@let Resource.Success(it)
                } ?: Resource.Failure(null, response.message())

            } else {
                Resource.Failure(null, response.message())
            }

        } catch (e: Exception) {
            Resource.Failure(e, null)
        }

    }

    override suspend fun saveMovie(movie: MovieEntity): Long {
        return movieDatabase.getMovieDAO().saveMovie(movie)
    }

    override fun getAllMoviesSaved() = movieDatabase.getMovieDAO().getAllMoviesSaved()

    override suspend fun deleteMovie(idDatabase: Int) {
        movieDatabase.getMovieDAO().deleteMovie(idDatabase)
    }
}