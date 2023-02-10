package com.anyandroid.postingapp.ui.main


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

import com.anyandroid.postingapp.data.PostsClient.Companion.getINSTANCE

import com.anyandroid.postingapp.pojo.PostModel

class PostViewModel: ViewModel(){
    val postsMutableLiveData = MutableLiveData<List<PostModel>>()
    fun getPosts(){
            getINSTANCE().getPosts().enqueue(object : retrofit2.Callback<List<PostModel>> {
            override fun onResponse(
                call: retrofit2.Call<List<PostModel>>,
                response: retrofit2.Response<List<PostModel>>
            ) {
                postsMutableLiveData.postValue(response.body())
            }

            override fun onFailure(call: retrofit2.Call<List<PostModel>>, t: Throwable) {
                postsMutableLiveData.postValue(null)
            }

        })
    }

}