package com.example.daggersampleapplication

import dagger.android.AndroidInjector
import dagger.android.*

class App : DaggerApplication() {
    override fun applicationInjector() : AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.factory().create(this)
    }
}
