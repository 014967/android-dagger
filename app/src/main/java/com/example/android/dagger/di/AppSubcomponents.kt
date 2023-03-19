package com.example.android.dagger.di

import com.example.android.dagger.registration.RegistrationComponent
import dagger.Module

/**
 * @Created by 김현국 2023/03/19
 */

@Module(subcomponents = [RegistrationComponent::class])
class AppSubcomponents
