package com.printoverit.travelapp.trip


import com.google.gson.annotations.SerializedName

data class TripRootDataClass(
    @SerializedName("flights")
    val flights: Flights,
    @SerializedName("success")
    val success: Boolean
)