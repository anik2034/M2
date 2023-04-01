package com.example.m2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.lifecycle.*
import androidx.recyclerview.widget.RecyclerView
import com.example.m2.databinding.ActivityMainBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.http.GET

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel:UniversityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





        viewModel = ViewModelProvider(this).get(UniversityViewModel::class.java)
        viewModel.loadUniverisites()
        viewModel.universitiesLiveData.observe(this, Observer{
            binding.recyclerView.adapter = this?.let {UniversityAdapter(
                viewModel.universitiesLiveData.value
            ) }
        })


    }
}





















