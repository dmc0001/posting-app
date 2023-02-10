package com.anyandroid.postingapp.ui.main

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.anyandroid.postingapp.R

import com.anyandroid.postingapp.pojo.PostModel

class MainActivity : AppCompatActivity() {
    private val postViewModel: PostViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        postViewModel.getPosts()


        val recyclerView = findViewById<RecyclerView>(R.id.recycler)
        val postAdapter = PostAdapter(arrayListOf())

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = postAdapter

        postViewModel.postsMutableLiveData.observe(this) {
            it?.let {
                Log.d(TAG, "dmc69 set list of post has been successes !!")
                postAdapter.setList(it as ArrayList<PostModel>)
            }
        }


    }
}