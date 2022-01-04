package com.leandro.desafio_mobile.ui.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.leandro.desafio_mobile.R
import com.leandro.desafio_mobile.ui.onboarding.OnboardingOneActivity
import com.leandro.desafio_mobile.utils.ToolbarConfig

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        initToolbar()

        val handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@SplashScreenActivity, OnboardingOneActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }

    private fun initToolbar() {
        ToolbarConfig.setDefaultStatusBarColor(this)
    }
}