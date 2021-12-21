package com.leandro.desafio_mobile.ui.favorite

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import com.leandro.desafio_mobile.R
import com.leandro.desafio_mobile.data.models.MovieResponse
import com.leandro.desafio_mobile.databinding.FragmentSettingsBinding
import com.leandro.desafio_mobile.ui.home.HomeActivity
import com.leandro.desafio_mobile.ui.home.HomeViewModel
import com.leandro.desafio_mobile.utils.OnMovieClickListener


class SettingsFragment : Fragment(), OnMovieClickListener {

    private lateinit var binding: FragmentSettingsBinding
    private lateinit var viewModel: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = (activity as HomeActivity).viewModel

        binding = FragmentSettingsBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }


    override fun onMovieClick(movieResponse: MovieResponse?) {
        if (movieResponse != null) {
            startActivity(MovieDetailsActivity.newIntent(requireContext(), movieResponse))
        }
    }


    override fun onResume() {
        super.onResume()

    }
}
