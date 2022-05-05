package com.example.sportycars.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sportycars.R
import com.example.sportycars.data.GalleryData
import com.example.sportycars.model.GalleryTransportation

class GalleryViewModel : ViewModel() {

    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    fun setData(data: GalleryTransportation){
        _image.value = data.carImg
    }
}