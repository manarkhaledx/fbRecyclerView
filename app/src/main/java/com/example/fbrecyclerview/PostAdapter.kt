package com.example.fbrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class PostAdapter (val items:List<Posts>?): RecyclerView.Adapter <PostAdapter.ViewHolder>() {





    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_post,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = items?.size?:0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val posts=items!![position]
        holder.username.text= posts?.username
        holder.time.text= posts?.time
        holder.postText.text= posts?.postText
        holder.likes.text= posts?.likes
        holder.profileImage.setImageResource(posts?.profileImage?:R.drawable.circle)
        holder.postImage.setImageResource(posts?.postImage?:R.drawable.postbackground)
    }
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val username:TextView =itemView.findViewById(R.id.tv_username)
        val time:TextView =itemView.findViewById(R.id.tv_time)
        val profileImage:ImageView=itemView.findViewById(R.id.iv_profile)
        val postText:TextView =itemView.findViewById(R.id.tv_post)
        val postImage:ImageView=itemView.findViewById(R.id.iv_post)
        val likes: TextView=itemView.findViewById(R.id.tv_likes)
    }
}