package com.printoverit.travelapp.days


import com.google.gson.annotations.SerializedName

data class DaysRootDataClass(
    @SerializedName("success")
    val success: Boolean,
    @SerializedName("trips")
    val trips: Trips
)