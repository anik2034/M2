package com.example.m2

import com.google.gson.annotations.SerializedName

class University (
    @SerializedName("country")
    var country: String,
    @SerializedName("name")
    var name: String,
    @SerializedName("alpha_two_code")
    var code: String
        )