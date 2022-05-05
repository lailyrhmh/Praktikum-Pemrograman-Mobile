package com.example.sportycars.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SlideshowCar(
    @DrawableRes val carImg: Int,
    @StringRes val carName: Int,
    @StringRes val carDesc: Int
)