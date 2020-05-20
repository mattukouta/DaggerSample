package com.example.daggersampleapplication.module

import com.example.daggersampleapplication.ActivityScope
import com.example.daggersampleapplication.SubActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SubActivityBuilder {
    @ActivityScope
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): SubActivity
}