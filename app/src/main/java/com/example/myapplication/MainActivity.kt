package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Getting the references of the TextView and Button

       var tvCounter = findViewById<TextView>(R.id.textView)
       var incrementBtn = findViewById<Button>(R.id.icr_btn)
       var decrementBtn = findViewById<TextView>(R.id.dcr_btn)

        //Implementing an Event listener on the increment button

        incrementBtn.setOnClickListener(View.OnClickListener {
            var getValue : String = tvCounter.text.toString()
            var newValue : Int = getValue.toInt() +1
            tvCounter.text  = newValue.toString()
        })

        decrementBtn.setOnClickListener(View.OnClickListener {
            var getValue : String = tvCounter.text.toString()
            var newValue : Int = getValue.toInt() -1
            tvCounter.text = newValue.toString()
        })


    }

}


