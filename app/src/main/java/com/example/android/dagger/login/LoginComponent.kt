package com.example.android.dagger.login

import com.example.android.dagger.di.ActivityScope
import dagger.Subcomponent

/**
 * @Created by 김현국 2023/03/19
 */

@ActivityScope
@Subcomponent
interface LoginComponent {
    @Subcomponent.Factory
    interface Factory {
        fun create(): LoginComponent
    }

    fun inject(activity: LoginActivity)
}
