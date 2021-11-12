package com.example.recruitment_examination_calc.di

import com.example.recruitment_examination_calc.ActivityLifecycleHandler
import com.example.recruitment_examination_calc.MainApplication

/**
 * Dagger保持
 */
class AppInjector {
    companion object {
        var component: AppComponent? = null
        fun init(application: MainApplication) {
            component = DaggerAppComponent.builder()
                .application(application)
                .build()
            component!!.inject(application)
            application.registerActivityLifecycleCallbacks(ActivityLifecycleHandler())
        }
    }
}