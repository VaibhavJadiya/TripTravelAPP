package com.printoverit.travelapp.flights


import com.google.gson.annotations.SerializedName

data class Places(
    @SerializedName("Flights")
    val flights: List<Flight>
)