package com.leandro.desafio_mobile.ui.home

import com.leandro.desafio_mobile.repositories.MovieRepository
import com.leandro.desafio_mobile.ui.viewmodels.MovieParentViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
open class HomeViewModel @Inject constructor(private val repository: MovieRepository) :
    MovieParentViewModel(repository) {

}