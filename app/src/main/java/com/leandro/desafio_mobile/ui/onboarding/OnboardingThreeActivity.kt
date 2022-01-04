package com.leandro.desafio_mobile.ui.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.leandro.desafio_mobile.databinding.ActivityOnboardingThreeBinding
import com.leandro.desafio_mobile.ui.HomeActivity
import com.leandro.desafio_mobile.utils.ToolbarConfig
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OnboardingThreeActivity : AppCompatActivity() {

    private var _binding: ActivityOnboardingThreeBinding? = null
    private val binding: ActivityOnboardingThreeBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityOnboardingThreeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initToolbar()

        binding.btnStart.setOnClickListener {
            val intent = Intent(this@OnboardingThreeActivity, HomeActivity::class.java)
            startActivity(intent)

            finish()
        }

    }

    private fun initToolbar() {
        ToolbarConfig.setDefaultStatusBarColor(this)
    }
}