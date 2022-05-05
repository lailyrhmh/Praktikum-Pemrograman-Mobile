package com.example.sportycars.adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportycars.R
import com.example.sportycars.model.ArticlesCar
import com.example.sportycars.model.SlideshowCar
import com.example.sportycars.ui.articles.ArticleDetailActivity
import com.example.sportycars.ui.articles.ArticlesViewModel
import com.example.sportycars.ui.slideshow.SlideshowViewModel

class ArticlesAdapter(
    private val context: Context,
    private val dataset: List<ArticlesCar>
) : RecyclerView.Adapter<ArticlesAdapter.ArticlesViewHolder>() {
    private val viewModel = ArticlesViewModel()

    class ArticlesViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val button = view.findViewById<Button>(R.id.item_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArticlesAdapter.ArticlesViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.article_item, parent, false)

        return ArticlesAdapter.ArticlesViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ArticlesAdapter.ArticlesViewHolder, position: Int) {
        val item = dataset[position]

        val context = holder.view.context

        holder.button.text = item.toString()
//            context.resources.getString(item.carName)

        holder.button.setOnClickListener {
            viewModel.setData(item, context)
            val  queryUrl: Uri = Uri.parse("${ArticleDetailActivity.SEARCH_PREFIX}${item}")

            val  intent = Intent(Intent.ACTION_VIEW, queryUrl)
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return dataset.size
    }
}