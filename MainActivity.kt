package com.jurasik.ll.testkotlinforandroid

import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.*
import android.os.Bundle


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { doSomething() }
    }

}
