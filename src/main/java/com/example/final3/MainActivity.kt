package com.example.final3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val madeonButton: View = findViewById(R.id.madeonButton)
        madeonButton.setOnClickListener { view ->
            val intent = Intent(this, onlyWayOut::class.java)
            startActivity(intent)
        }
        val arkPatrolButton: View = findViewById(R.id.arkPatrolButton)
        arkPatrolButton.setOnClickListener { view ->
            val intent = Intent(this, betrayalOfLyla::class.java)
            startActivity(intent)

        }
        val sparksButton: View = findViewById(R.id.sparksButton)
        sparksButton.setOnClickListener { view ->
            val intent = Intent(this, sendThePainOn::class.java)
            startActivity(intent)

        }
        val LuneButton: View = findViewById(R.id.LuneButton)
        LuneButton.setOnClickListener { view ->
            val intent = Intent(this, reveLucid::class.java)
            startActivity(intent)
        }
        val soulAndHeartButton: View = findViewById(R.id.soulAndHeartButton)
        soulAndHeartButton.setOnClickListener { view ->
            val intent = Intent(this, soulAndHeart::class.java)
            startActivity(intent)
        }
    }
}