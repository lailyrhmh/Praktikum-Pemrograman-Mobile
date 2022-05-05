package com.example.sportycars.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sportycars.R
import com.example.sportycars.model.SlideshowCar
import com.example.sportycars.ui.slideshow.SlideDetailActivity
import com.example.sportycars.ui.slideshow.SlideshowViewModel

class SlideshowAdapter(
    private val context: Context,
    private val dataset: List<SlideshowCar>
    ) : RecyclerView.Adapter<SlideshowAdapter.SlideshowViewHolder>() {
        private val viewModel = SlideshowViewModel()

        class SlideshowViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
            val textView: TextView = view.findViewById(R.id.item_title)
            val imageView: ImageView = view.findViewById(R.id.item_image)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SlideshowViewHolder {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.slideshow_item, parent, false)

            return SlideshowViewHolder(adapterLayout)
        }

        override fun onBindViewHolder(holder: SlideshowViewHolder, position: Int) {
            val item = dataset[position]
            holder.textView.text = context.resources.getString(item.carName)
            holder.imageView.setImageResource(item.carImg)

            holder.view.setOnClickListener{
                viewModel.setData(item, context)
                val intent = Intent(context, SlideDetailActivity::class.java).apply {
                    putExtra("image", viewModel.image.value)
                    putExtra("name", viewModel.name.value)
                    putExtra("description", viewModel.description.value)
                }
                context.startActivity(intent)
            }
        }

        override fun getItemCount(): Int {
            return dataset.size
        }
}