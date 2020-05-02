package com.example.daggersampleapplication.module

import com.example.daggersampleapplication.ActivityScope
import com.example.daggersampleapplication.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityBuilder {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}
