package com.example.sportycars.ui.articles

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.sportycars.adapter.ArticlesAdapter
import com.example.sportycars.adapter.SlideshowAdapter
import com.example.sportycars.data.ArticlesData
import com.example.sportycars.data.SlideshowData
import com.example.sportycars.databinding.FragmentArticlesBinding
import com.example.sportycars.databinding.FragmentSlideshowBinding

class ArticlesFragment: Fragment() {
    private var _binding: FragmentArticlesBinding? = null
    private val binding get() = _binding!!
    private lateinit var recycleView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentArticlesBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        recycleView = binding.articleRV
        recycleView.adapter = ArticlesAdapter(requireContext(), ArticlesData().loadTransportation())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}