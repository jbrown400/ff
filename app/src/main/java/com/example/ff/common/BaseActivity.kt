package com.example.ff.common

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ff.R

class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
