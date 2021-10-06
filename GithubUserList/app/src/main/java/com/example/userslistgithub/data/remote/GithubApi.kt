package com.example.userslistgithub.data.remote

import com.example.userslistgithub.model.GithubUser
import retrofit2.Call
import retrofit2.http.GET

interface GithubApi {

    @GET("users")
    fun getUsers(): Call<List<GithubUser>>
}