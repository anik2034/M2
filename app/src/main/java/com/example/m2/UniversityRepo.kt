package com.example.m2

class UniversityRepo {
    private val retrofit by lazy { RetrofitHelper.getInstance() }
    suspend fun fetchUniversities(): List<University> {
        val apiService = retrofit.create(UniversityApiService::class.java)
        return apiService.fetchUniversities()
    }
}