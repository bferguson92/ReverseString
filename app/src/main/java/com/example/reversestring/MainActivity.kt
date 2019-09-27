package com.example.reversestring

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(view: View){
        when(view.id){
            R.id.btnReverse -> showReversedString()
        }
    }

    fun showReversedString(){
        var str = etString.text.toString()
        str = str.reversed()

        tvReversedString.text = str
    }

}
