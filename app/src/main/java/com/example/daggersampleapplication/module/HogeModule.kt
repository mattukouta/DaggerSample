package com.example.daggersampleapplication.module

import com.example.daggersampleapplication.HogeImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class HogeModule {
    @Singleton
    @Provides
    fun provideHoge() = HogeImpl("mattu")
}