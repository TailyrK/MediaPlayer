package com.example.final3

import android.graphics.drawable.AnimationDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_soul_and_heart.*

class betrayalOfLyla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_betrayal_of_lyla)

        val animationDrawable = constraintLayout.background as AnimationDrawable

        animationDrawable.apply {
            setExitFadeDuration(1000)
            setExitFadeDuration(2000)
            start()

        }
    }


    var mMediaPlayer: MediaPlayer? = null

    fun playSound (view: View) {
        if (mMediaPlayer == null) {
            mMediaPlayer = MediaPlayer.create(this, R.raw.betrayaloflyla)
            mMediaPlayer!!.isLooping = true
            mMediaPlayer!!.start()
        } else mMediaPlayer!!.start()
    }

    fun pauseSound(view: View) {
        if (mMediaPlayer != null && mMediaPlayer!!.isPlaying) mMediaPlayer!!.pause()

        val animationDrawable = constraintLayout.background as AnimationDrawable

        animationDrawable.apply {
            setExitFadeDuration(1000)
            setExitFadeDuration(2000)
            start()

        }
    }
}
