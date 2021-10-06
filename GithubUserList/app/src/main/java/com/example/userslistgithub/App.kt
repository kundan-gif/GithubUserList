package com.example.userslistgithub

import android.app.Application
import com.example.userslistgithub.di.apiModule
import com.example.userslistgithub.di.repositoryModule
import com.example.userslistgithub.di.retrofitModule
import com.example.userslistgithub.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(listOf(repositoryModule, viewModelModule, retrofitModule, apiModule))
        }
    }
}