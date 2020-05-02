package com.example.daggersampleapplication

import javax.inject.Inject

interface Hoge {
    fun stringHoge(): String
    fun stringFuga(): String
    fun stringFoo(): String
}

class HogeImpl @Inject constructor(private val string: String) : Hoge {
    override fun stringHoge() = "hoge"
    override fun stringFuga() = "fuga"
    override fun stringFoo() = string
}
