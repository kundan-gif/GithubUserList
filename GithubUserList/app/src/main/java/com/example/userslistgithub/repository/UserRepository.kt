package com.example.userslistgithub.repository

import com.example.userslistgithub.data.remote.GithubApi

class UserRepository(private val api: GithubApi) {
    fun getAllUsers() = api.getUsers()
}