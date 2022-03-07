package com.printoverit.travelapp.dataclasses


import com.google.gson.annotations.SerializedName

data class RootDataClass(
    @SerializedName("places")
    val places: Places,
    @SerializedName("success")
    val success: Boolean
)