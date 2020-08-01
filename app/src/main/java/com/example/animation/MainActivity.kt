package com.example.animation

import android.animation.AnimatorInflater
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val animation: Animation=AnimationUtils.loadAnimation(this,R.anim.anim_trans)
        image_view1.startAnimation(animation)

        val animator=AnimatorInflater.loadAnimator(this,R.animator.animator_start)
        animator.setTarget(image_view1)

        image.setOnClickListener {
            animator.start()
        }

        image_view1.setOnClickListener {
            animator.start()

        }
        button.setOnClickListener {
            animator.pause()
        }
    }
}
