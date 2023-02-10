package com.anyandroid.postingapp.ui.main

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.anyandroid.postingapp.R
import com.anyandroid.postingapp.pojo.PostModel

class PostAdapter(var postsList :ArrayList<PostModel>): RecyclerView.Adapter<PostAdapter.PostViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
        val listItem = LayoutInflater.from(parent.context).inflate(R.layout.post_item,parent,false)
        return PostViewHolder(listItem)

    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {
        val currentItem =  postsList[position]
        holder.title.text = currentItem.title
        holder.body.text = currentItem.body
        holder.userId.text = currentItem.userId.toString()

    }
    @SuppressLint("NotifyDataSetChanged")
    fun setList(posts: ArrayList<PostModel>){
        postsList = posts
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return postsList.size
    }

    class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById<TextView>(R.id.post_title)!!
        val body= itemView.findViewById<TextView>(R.id.post_body)!!
        val userId = itemView.findViewById<TextView>(R.id.post_user)!!


    }
}