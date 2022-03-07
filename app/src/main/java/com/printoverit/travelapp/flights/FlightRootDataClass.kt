package com.printoverit.travelapp.flights


import com.google.gson.annotations.SerializedName

data class FlightRootDataClass(
    @SerializedName("places")
    val places: Places,
    @SerializedName("premium")
    val premium: String,
    @SerializedName("success")
    val success: Boolean
)