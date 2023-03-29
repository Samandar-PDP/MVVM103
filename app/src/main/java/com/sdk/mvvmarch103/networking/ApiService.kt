package com.sdk.mvvmarch103.networking

import com.sdk.mvvmarch103.model.ImageResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("photos")
    suspend fun getPhotos(): Response<ImageResponse>
}