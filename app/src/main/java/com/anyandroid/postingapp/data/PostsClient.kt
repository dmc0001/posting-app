package com.anyandroid.postingapp.data


import com.anyandroid.postingapp.pojo.PostModel
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PostsClient() {
      private var postInterface: PostInterface

    init {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        postInterface = retrofit.create(PostInterface::class.java)
    }




    fun getPosts(): Call<List<PostModel>> = postInterface.getPosts()


    companion object {
        private const val BASE_URL = "https://jsonplaceholder.typicode.com/"
        private var INSTANCE = PostsClient()

        fun getINSTANCE() = INSTANCE



    }
}
