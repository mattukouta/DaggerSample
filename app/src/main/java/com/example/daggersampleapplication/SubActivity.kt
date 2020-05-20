package com.example.daggersampleapplication

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity

class SubActivity : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }
}
