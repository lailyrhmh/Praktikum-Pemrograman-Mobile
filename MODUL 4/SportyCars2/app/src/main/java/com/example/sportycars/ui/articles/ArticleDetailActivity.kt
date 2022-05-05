package com.example.sportycars.ui.articles

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.sportycars.R
import com.example.sportycars.adapter.ArticlesAdapter
import com.example.sportycars.data.ArticlesData
import com.example.sportycars.databinding.ActivityArticleDetailBinding

class ArticleDetailActivity : AppCompatActivity() {
    private var _binding: ActivityArticleDetailBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_NAME = "name"
        val SEARCH_PREFIX = "https://www.google.com/search?q="
    }

//    private lateinit var carId: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        arguments?.let {
//            carId = it.getString(EXTRA_NAME).toString()
//        }

        _binding = ActivityArticleDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
//
//        val name = binding.youtubePlayerView
//        getLifecycle().addObserver(name)
//
//        name.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
//            override fun onReady(youTubePlayer: YouTubePlayer) {
//                val videoId = intent.getStringExtra(EXTRA_LINK) //change according to your need
//                if (videoId != null) {
//                    youTubePlayer.loadVideo(videoId, 0F)
//                }
//            }
//        })
    }


}