package com.example.testing

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_singup.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar!!.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loginbutton.setOnClickListener {
            startActivity(Intent(this,SinginActivity::class.java))
        }
        borjomi.setOnClickListener {
            startActivity(Intent(this,SinginActivity::class.java))
        }
        batumi.setOnClickListener {
            startActivity(Intent(this,SinginActivity::class.java))
        }
        kakheti.setOnClickListener {
            startActivity(Intent(this,SinginActivity::class.java))
        }
        tbilisi.setOnClickListener {
            startActivity(Intent(this,SinginActivity::class.java))
        }
        rabati.setOnClickListener {
            startActivity(Intent(this,SinginActivity::class.java))
        }
        svaneti.setOnClickListener {
            startActivity(Intent(this,SinginActivity::class.java))
        }
        val rgolebis = AnimationUtils.loadAnimation(this,R.anim.rgolebis)
        val rabati = findViewById(R.id.rabati) as Button
        rabati.startAnimation(rgolebis)
        val batumi = findViewById(R.id.batumi) as Button
        batumi.startAnimation(rgolebis)
        val tbilisi = findViewById(R.id.tbilisi) as Button
        tbilisi.startAnimation(rgolebis)
        val kakheti = findViewById(R.id.kakheti) as Button
        kakheti.startAnimation(rgolebis)
        val borjomi = findViewById(R.id.borjomi) as Button
        borjomi.startAnimation(rgolebis)
        val svaneti = findViewById(R.id.svaneti) as Button
        svaneti.startAnimation(rgolebis)


    }
}
