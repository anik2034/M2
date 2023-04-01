package com.example.m2

import retrofit2.http.GET

interface UniversityApiService {
    @GET("http://universities.hipolabs.com/search?country=United+States")
    suspend fun fetchUniversities():List<University>
}