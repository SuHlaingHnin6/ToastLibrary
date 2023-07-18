package com.isecom.dev.apilibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isecom.dev.api_collect.ToastMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       ToastMessage().mtoast(this,"This is testing toast message")
    }
}