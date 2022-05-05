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
import com.example.sportycars.model.GalleryTransportation
import com.example.sportycars.ui.gallery.GalleryDetailActivity
import com.example.sportycars.ui.gallery.GalleryFragment
import com.example.sportycars.ui.gallery.GalleryViewModel

class GalleryAdapter(
    private val context: Context,
    private val dataset: List<GalleryTransportation>
) : RecyclerView.Adapter<GalleryAdapter.GalleryViewHolder>() {
    private val viewModel = GalleryViewModel()

    class GalleryViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        //        val textView: TextView = view.findViewById(R.id.item_title)
//        val textView2: TextView = view.findViewById(R.id.item_desc)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.gallery_item, parent, false)

        return GalleryViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        val item = dataset[position]
        holder.imageView.setImageResource(item.carImg)

        holder.view.setOnClickListener{
            viewModel.setData(item)
            val intent = Intent(context, GalleryDetailActivity::class.java).apply {
                putExtra("image", viewModel.image.value)
            }
            context.startActivity(intent)
        }
    }

    override fun getItemCount() = dataset.size

}