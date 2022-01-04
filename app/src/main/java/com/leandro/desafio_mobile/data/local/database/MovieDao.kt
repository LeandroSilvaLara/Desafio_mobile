package com.leandro.desafio_mobile.data.local.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.leandro.desafio_mobile.data.local.entity.MovieEntity

@Dao
interface MovieDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun saveMovie(movie: MovieEntity): Long

    @Query("SELECT * FROM movies")
    fun getAllMoviesSaved(): LiveData<List<MovieEntity>?>

    @Query("DELETE FROM movies WHERE idDatabase = :idDatabase")
    suspend fun deleteMovie(idDatabase: Int)

}