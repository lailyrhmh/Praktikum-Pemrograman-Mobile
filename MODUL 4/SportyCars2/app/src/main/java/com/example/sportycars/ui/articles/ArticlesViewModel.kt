package com.example.sportycars.ui.articles

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.sportycars.model.ArticlesCar

class ArticlesViewModel : ViewModel() {
    private val _name = MutableLiveData<String>()
    val name: LiveData<String> = _name

    fun setData(data: ArticlesCar, context: Context) {
        _name.value = context.getString(data.carName)
    }
}