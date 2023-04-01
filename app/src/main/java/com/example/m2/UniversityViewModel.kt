package com.example.m2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class UniversityViewModel: ViewModel() {
    private val _universityLiveData: MutableLiveData<List<University>> = MutableLiveData<List<University>>()
    val universitiesLiveData: LiveData<List<University>> = _universityLiveData
    private val networkService by lazy { UniversityRepo() }

    fun loadUniverisites() {


        viewModelScope.launch(Dispatchers.IO) {

            _universityLiveData.postValue(networkService.fetchUniversities())

        }
    }
}