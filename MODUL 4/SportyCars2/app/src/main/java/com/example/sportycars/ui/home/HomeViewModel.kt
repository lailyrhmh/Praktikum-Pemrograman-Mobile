package com.example.sportycars.ui.home

import android.media.Image
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sportycars.R

class HomeViewModel : ViewModel() {

//    private val _text = MutableLiveData<String>().apply {
//        //value = "This is home Fragment"
//        value = R.layout.fragment_home.toString()
//    }
//    val text: LiveData<String> = _text

    private val _image = MutableLiveData<Int>().apply {
        value = R.drawable.ic_home_car
    }
    val image: LiveData<Int> = _image
}