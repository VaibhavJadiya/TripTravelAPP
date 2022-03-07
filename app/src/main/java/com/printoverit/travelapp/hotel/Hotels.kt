package com.printoverit.travelapp.hotel


import com.google.gson.annotations.SerializedName

data class Hotels(
    @SerializedName("Jaipur")
    val jaipur: List<Jaipur>,
    @SerializedName("Jodhpur")
    val jodhpur: List<Jodhpur>,
    @SerializedName("Kota")
    val kota: List<Kota>,
    @SerializedName("Udaipur")
    val udaipur: List<Udaipur>
)