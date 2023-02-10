package com.anyandroid.postingapp.data

import com.anyandroid.postingapp.pojo.PostModel
import retrofit2.Call
import retrofit2.http.GET

interface PostInterface {
    @GET("posts")
    fun getPosts(): Call<List<PostModel>>
}