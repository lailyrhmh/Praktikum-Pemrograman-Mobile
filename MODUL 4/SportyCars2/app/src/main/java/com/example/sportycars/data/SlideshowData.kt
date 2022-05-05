package com.example.sportycars.data

import com.example.sportycars.R
import com.example.sportycars.model.GalleryTransportation
import com.example.sportycars.model.SlideshowCar

class SlideshowData {
    fun loadTransportation(): List<SlideshowCar> {
        return listOf<SlideshowCar>(
            SlideshowCar(R.drawable.img1, R.string.car1, R.string.desc1),
            SlideshowCar(R.drawable.img2, R.string.car2, R.string.desc1),
            SlideshowCar(R.drawable.img3, R.string.car3, R.string.desc1),
            SlideshowCar(R.drawable.img4, R.string.car4, R.string.desc1),
            SlideshowCar(R.drawable.img5, R.string.car5, R.string.desc1),
            SlideshowCar(R.drawable.img6, R.string.car6, R.string.desc1),
            SlideshowCar(R.drawable.img7, R.string.car7, R.string.desc1),
            SlideshowCar(R.drawable.img8, R.string.car8, R.string.desc1),
            SlideshowCar(R.drawable.img9, R.string.car9, R.string.desc1),
            SlideshowCar(R.drawable.img10, R.string.car10, R.string.desc1),
        )
    }
}