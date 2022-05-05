package com.example.sportycars.ui.slideshow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sportycars.databinding.ActivityArticleDetailBinding

class SlideDetailActivity : AppCompatActivity()  {
    private var _binding: ActivityArticleDetailBinding? = null
    private val binding get() = _binding!!

    companion object{
        const val EXTRA_IMAGE = "image"
        const val EXTRA_NAME = "name"
        const val EXTRA_DESCRIPTION = "description"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityArticleDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val image = binding.imageCarDetail
        image.setImageResource(intent.getIntExtra(EXTRA_IMAGE, 0))

        val name = binding.nameCarDetail
        name.text = intent.getStringExtra(EXTRA_NAME)

        val description = binding.descCarDetail
        description.text = intent.getStringExtra(EXTRA_DESCRIPTION)
    }
}