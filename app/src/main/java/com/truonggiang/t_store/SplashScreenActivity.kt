package com.truonggiang.t_store

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.widget.ImageView
import com.google.android.material.animation.AnimationUtils

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var logoBack: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        logoBack = findViewById(R.id.splashscreen)
        logoBack.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this, R.anim.out_anim))
    }
}