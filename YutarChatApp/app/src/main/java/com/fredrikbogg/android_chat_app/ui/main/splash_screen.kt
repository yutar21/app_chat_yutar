package com.fredrikbogg.android_chat_app.ui.main

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.fredrikbogg.android_chat_app.R

class splash_screen : AppCompatActivity() {
    lateinit var handler : Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val options = ActivityOptions.makeCustomAnimation(this, R.drawable.slide_in_right, R.drawable.slide_out_left)

        handler = Handler()
        handler.postDelayed({

            // Delay and Start Activity
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent,options.toBundle())
            finish()
        } , 3000)

    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.drawable.slide_in_right, R.drawable.slide_out_left)
    }

}