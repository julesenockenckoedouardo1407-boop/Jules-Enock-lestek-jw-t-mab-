package com.julesenock.lesteke

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.graphics.Typeface
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val root = LinearLayout(this)
        root.orientation = LinearLayout.VERTICAL
        root.gravity = Gravity.CENTER
        root.setPadding(30, 30, 30, 30)
        root.setBackgroundColor(Color.rgb(38, 61, 32))

        val title = TextView(this)
        title.text = "JULES ENOCK LESTEKÈ"
        title.textSize = 32f
        title.setTextColor(Color.WHITE)
        title.setTypeface(null, Typeface.BOLD)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "JWÈT MAB"
        subtitle.textSize = 25f
        subtitle.setTextColor(Color.rgb(255, 212, 0))
        subtitle.setTypeface(null, Typeface.BOLD)
        subtitle.gravity = Gravity.CENTER

        val contact = TextView(this)
        contact.text = "Contact : +509 4040 9680"
        contact.textSize = 17f
        contact.setTextColor(Color.WHITE)
        contact.gravity = Gravity.CENTER

        val play = Button(this)
        play.text = "JOUER"
        play.textSize = 20f

        root.addView(title)
        root.addView(subtitle)

        val space = TextView(this)
        space.text = ""
        root.addView(
            space,
            LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                30
            )
        )

        root.addView(contact)

        root.addView(
            play,
            LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply {
                topMargin = 35
            }
        )

        play.setOnClickListener {
            // Le jeu de billes sera intégré ici.
        }

        setContentView(root)
    }
}
