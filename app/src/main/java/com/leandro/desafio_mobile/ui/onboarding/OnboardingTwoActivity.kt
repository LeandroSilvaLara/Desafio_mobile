package com.leandro.desafio_mobile.ui.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.leandro.desafio_mobile.databinding.ActivityOnboardingTwoBinding
import com.leandro.desafio_mobile.utils.ToolbarConfig

class OnboardingTwoActivity : AppCompatActivity() {

    private var _binding: ActivityOnboardingTwoBinding? = null
    private val binding: ActivityOnboardingTwoBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityOnboardingTwoBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initToolbar()

        binding.btnNext.setOnClickListener {
            val intent = Intent(this@OnboardingTwoActivity, OnboardingThreeActivity::class.java)
            startActivity(intent)
        }

    }

    private fun initToolbar() {
        ToolbarConfig.setDefaultStatusBarColor(this)
    }
}