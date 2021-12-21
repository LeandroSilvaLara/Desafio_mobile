package com.leandro.desafio_mobile.ui.onboarding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.leandro.desafio_mobile.R
import com.leandro.desafio_mobile.databinding.ActivityHomeBinding
import com.leandro.desafio_mobile.databinding.ActivityOnboardingOneBinding
import com.leandro.desafio_mobile.ui.home.HomeActivity
import com.leandro.desafio_mobile.utils.ToolbarConfig
import com.leandro.desafio_mobile.utils.Preferences
import com.leandro.desafio_mobile.utils.PreferencesKey.ON_BOARDING


class OnboardingOneActivity : AppCompatActivity() {

    private var _binding: ActivityOnboardingOneBinding? = null
    private val binding: ActivityOnboardingOneBinding get() = _binding!!

    private lateinit var preferences: Preferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityOnboardingOneBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initToolbar()

        // Initialize Shared Preferences
        preferences = Preferences(this)

        checkOnboardingStatus()

        binding.btnHome.setOnClickListener {
            val intent = Intent(this@OnboardingOneActivity, OnboardingTwoActivity::class.java)
            startActivity(intent)
        }

        binding.btnSkip.setOnClickListener {
            // Set flag onboarding to 1 (skip onboarding) in Preferences
            preferences.setValues(ON_BOARDING, "1")

            val intent = Intent(this@OnboardingOneActivity, HomeActivity::class.java)
            startActivity(intent)

            finish()
        }

    }

    private fun initToolbar() {
        ToolbarConfig.setDefaultStatusBarColor(this)
    }

    private fun checkOnboardingStatus() {
        // Check preferences Onboarding status
        // onboarding -> 1 (Onboarding skipped to SignInActivity)
        // onboarding -> null (launch from Onboarding)
        if (preferences.getValues(ON_BOARDING).equals("1")) {

            val intent = Intent(
                this@OnboardingOneActivity,
                HomeActivity::class.java
            )
            startActivity(intent)

            finish()
        }
    }
}