package com.hbv1.myclub

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.NumberPicker
import android.widget.Toast


class PlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_player)

        var numberPicker = findViewById<NumberPicker>(R.id.np)

        if (numberPicker != null) {
            numberPicker.minValue = 0
            numberPicker.maxValue = 10
            numberPicker.wrapSelectorWheel = true
            numberPicker.setOnValueChangedListener { picker, oldVal, newVal ->
                val text = "Changed from $oldVal to $newVal"
                Toast.makeText(this@PlayerActivity, text, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
