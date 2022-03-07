package com.printoverit.travelapp.hotel


import com.google.gson.annotations.SerializedName

data class HotelRootDataClass(
    @SerializedName("hotels")
    val hotels: Hotels,
    @SerializedName("success")
    val success: Boolean
)