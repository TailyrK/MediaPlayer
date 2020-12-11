package com.example.final3

import android.graphics.drawable.AnimationDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import kotlinx.android.synthetic.main.activity_send_the_pain_on.*
import kotlinx.android.synthetic.main.activity_send_the_pain_on.constraintLayout

class sendThePainOn : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_the_pain_on)

        val animationDrawable = constraintLayout.background as AnimationDrawable
        animationDrawable.apply {
            setExitFadeDuration(1000)
            setExitFadeDuration(2000)
            start()
        }
    }
        var mMediaPlayer: MediaPlayer? = null

        fun playSound(view: View) {
            if (mMediaPlayer == null) {
                mMediaPlayer = MediaPlayer.create(this, R.raw.sendthepainon)
                mMediaPlayer!!.isLooping = true
                mMediaPlayer!!.start()
            } else mMediaPlayer!!.start()
        }

        fun pauseSound(view: View) {
            if (mMediaPlayer != null && mMediaPlayer!!.isPlaying) mMediaPlayer!!.pause()

        }
    }
