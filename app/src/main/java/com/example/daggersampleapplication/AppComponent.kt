package com.example.daggersampleapplication

import com.example.daggersampleapplication.module.HogeModule
import com.example.daggersampleapplication.module.MainActivityBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        MainActivityBuilder::class,
        HogeModule::class
    ]
)

interface AppComponent: AndroidInjector<App> {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance app: App): AppComponent
    }
}