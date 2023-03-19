package com.example.android.dagger.di

import javax.inject.Scope

/**
 * @Created by 김현국 2023/03/19
 */

@Scope
@MustBeDocumented
@Retention(value = AnnotationRetention.RUNTIME)
annotation class LoggedUserScope
