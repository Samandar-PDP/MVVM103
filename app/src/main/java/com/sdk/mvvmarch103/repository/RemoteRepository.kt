package com.sdk.mvvmarch103.repository

import com.sdk.mvvmarch103.networking.ApiService

class RemoteRepository(
    private val apiService: ApiService
) {
    suspend fun getPhotos() = apiService.getPhotos()
}