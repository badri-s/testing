package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_singin.*
import kotlinx.android.synthetic.main.activity_singup.*

class SinginActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singin)
        singupbutton.setOnClickListener {
            startActivity(Intent(this,SingupActivity::class.java))
        }
        val singin =AnimationUtils.loadAnimation(this,R.anim.singin)
        val singinlay = findViewById(R.id.singinlay) as LinearLayout
        singinlay.startAnimation(singin)
        reginbutton.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }
    }
}
