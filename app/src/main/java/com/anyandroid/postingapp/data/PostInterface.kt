package com.anyandroid.postingapp.data


import com.anyandroid.postingapp.pojo.PostModel
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface PostInterface {
    @GET("posts")
    fun getPosts(): Single<List<PostModel>>
}