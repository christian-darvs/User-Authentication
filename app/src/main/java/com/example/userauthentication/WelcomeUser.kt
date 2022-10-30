package com.example.userauthentication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class WelcomeUser : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_user)
        val img: ImageView = findViewById(R.id.imageView2)
        Glide.with(this).load(R.drawable.giphy).into(img)

    }
}