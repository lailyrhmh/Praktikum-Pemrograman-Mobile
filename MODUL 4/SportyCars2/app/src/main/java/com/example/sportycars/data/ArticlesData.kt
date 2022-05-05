package com.example.sportycars.data

import com.example.sportycars.R
import com.example.sportycars.model.ArticlesCar
import com.example.sportycars.model.SlideshowCar

class ArticlesData {
    fun loadTransportation(): List<ArticlesCar> {
        return listOf<ArticlesCar>(
            ArticlesCar(R.string.car1),
            ArticlesCar(R.string.car2),
            ArticlesCar(R.string.car3),
            ArticlesCar(R.string.car4),
            ArticlesCar(R.string.car5),
            ArticlesCar(R.string.car6),
            ArticlesCar(R.string.car7),
            ArticlesCar(R.string.car8),
            ArticlesCar(R.string.car9),
            ArticlesCar(R.string.car10),
        )
    }
}