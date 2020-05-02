package com.example.daggersampleapplication

import android.os.Bundle
import android.widget.Toast
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject lateinit var hoge: HogeImpl

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, hoge.stringFoo(), Toast.LENGTH_SHORT).show()
        hoge.stringHoge()
        hoge.stringFuga()
    }
}
