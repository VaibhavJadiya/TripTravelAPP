package com.printoverit.travelapp.days


import com.google.gson.annotations.SerializedName

data class Trips(
    @SerializedName("Amritsar")
    val amritsar: List<Amritsar>,
    @SerializedName("Assam")
    val assam: List<Assam>,
    @SerializedName("Goa")
    val goa: List<Goa>,
    @SerializedName("Jodhpur")
    val jodhpur: List<Jodhpur>,
    @SerializedName("Maharastra")
    val maharastra: List<Maharastra>,
    @SerializedName("Shimla")
    val shimla: List<Shimla>
)