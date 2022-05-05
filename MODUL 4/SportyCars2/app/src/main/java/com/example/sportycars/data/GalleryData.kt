package com.example.sportycars.data

import com.example.sportycars.R
import com.example.sportycars.model.GalleryTransportation

class GalleryData {
    fun loadTransportation(): List<GalleryTransportation> {
        return listOf<GalleryTransportation>(
            GalleryTransportation(R.drawable.img1),
            GalleryTransportation(R.drawable.img2),
            GalleryTransportation(R.drawable.img3),
            GalleryTransportation(R.drawable.img4),
            GalleryTransportation(R.drawable.img5),
            GalleryTransportation(R.drawable.img6),
            GalleryTransportation(R.drawable.img7),
            GalleryTransportation(R.drawable.img8),
            GalleryTransportation(R.drawable.img9),
            GalleryTransportation(R.drawable.img10),
        )
    }
}