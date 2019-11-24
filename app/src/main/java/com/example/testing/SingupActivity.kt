package com.example.testing

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Contacts
import android.view.animation.AnimationUtils
import android.widget.FrameLayout
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_singin.*
import kotlinx.android.synthetic.main.activity_singup.*

class SingupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singup)
        singinbutton.setOnClickListener {
            startActivity(Intent(this,SinginActivity::class.java))
        }
        val singin = AnimationUtils.loadAnimation(this,R.anim.singin)
        val singuplay = findViewById(R.id.singuplay) as FrameLayout
        singuplay.startAnimation(singin)
        regupbutton.setOnClickListener {
            startActivity(Intent(this,ProfileActivity::class.java))
        }
    }
}
