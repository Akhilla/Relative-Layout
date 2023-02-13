package com.example.relativelayout_akhilla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setspinnerday()
        setspinnertime()
    }
    fun setspinnerday(){
        val spinnerDay:Spinner = findViewById(R.id.datespinner)

        ArrayAdapter.createFromResource(
            this,
            R.array.day_array,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item
        ).also {
            it.setDropDownViewResource(
                com.google.android.material.R.layout.support_simple_spinner_dropdown_item
            )
            spinnerDay.adapter = it
        }
    }

      fun setspinnertime(){
        val spinnerDay:Spinner = findViewById(R.id.timespinner)

        ArrayAdapter.createFromResource(
            this,
            R.array.time_array,
            com.google.android.material.R.layout.support_simple_spinner_dropdown_item
        ).also {
            it.setDropDownViewResource(
                com.google.android.material.R.layout.support_simple_spinner_dropdown_item
            )
            spinnerDay.adapter = it
        }
    }
}

