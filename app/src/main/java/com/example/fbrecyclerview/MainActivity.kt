package com.example.fbrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fbrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    lateinit var adapter: PostAdapter
    lateinit var postList: MutableList<Posts>
    private fun initRecyclerView() {
        createPostList()
        adapter=PostAdapter(postList)
        binding.rvPost.adapter=adapter
    }

    private fun createPostList() {
        postList= mutableListOf()
        for( i in 1..100){
            postList.add(Posts("post $i","time:$i",R.drawable.user,"PostText $i",R.drawable.postfb,"$i likes"))
        }
    }
}