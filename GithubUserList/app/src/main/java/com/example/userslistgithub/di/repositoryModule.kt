package com.example.userslistgithub.di

import com.example.userslistgithub.repository.UserRepository
import org.koin.dsl.module

val repositoryModule = module {
    single {
        UserRepository(get())
    }
}