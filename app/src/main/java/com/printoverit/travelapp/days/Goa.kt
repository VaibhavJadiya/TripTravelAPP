package com.printoverit.travelapp.days


import com.google.gson.annotations.SerializedName

data class Goa(
    @SerializedName("contact")
    val contact: String,
    @SerializedName("days")
    val days: String,
    @SerializedName("expenses")
    val expenses: String,
    @SerializedName("placeimage")
    val placeimage: String,
    @SerializedName("placename")
    val placename: String
)