package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationActivity
import dagger.Component

/**
 * @Created by 김현국 2023/03/17
 */
@Component
interface AppComponent {

    fun inject(activity: RegistrationActivity)
}
