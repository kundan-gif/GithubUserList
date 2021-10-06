package com.example.userslistgithub.di

import com.example.userslistgithub.data.remote.GithubApi
import org.koin.dsl.module
import retrofit2.Retrofit

val apiModule = module {
    fun provideUseApi(retrofit: Retrofit): GithubApi {
        return retrofit.create(GithubApi::class.java)
    }

    single { provideUseApi(get()) }
}