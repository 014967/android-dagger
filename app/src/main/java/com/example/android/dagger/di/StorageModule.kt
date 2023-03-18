package com.example.android.dagger.di

import com.example.android.dagger.storage.SharedPreferencesStorage
import com.example.android.dagger.storage.Storage
import dagger.Binds
import dagger.Module

/**
 * @Created by 김현국 2023/03/18
 */
@Module
abstract class StorageModule {
    @Binds
    abstract fun provideStorage(storage: SharedPreferencesStorage) : Storage
}