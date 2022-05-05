package com.example.sportycars.ui.slideshow

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sportycars.data.SlideshowData
import com.example.sportycars.model.SlideshowCar

class SlideshowViewModel : ViewModel() {
    private val _image = MutableLiveData<Int>()
    val image: LiveData<Int> = _image

    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    private val _desc = MutableLiveData<String>()
    val description: LiveData<String> = _desc

    fun setData(data: SlideshowCar, context: Context) {
        _image.value = data.carImg
        _name.value = context.getString(data.carName)
        _desc.value = context.getString(data.carDesc)
    }
}