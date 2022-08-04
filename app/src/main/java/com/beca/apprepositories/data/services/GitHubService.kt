package com.beca.apprepositories.data.services

import com.beca.apprepositories.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path


interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositores(@Path("user") user: String?): List<Repo>
}