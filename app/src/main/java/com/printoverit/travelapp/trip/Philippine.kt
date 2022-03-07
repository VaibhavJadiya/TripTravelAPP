package com.printoverit.travelapp.trip


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Philippine(
    @SerializedName("booking")
    val booking: String,
    @SerializedName("charging")
    val charging: String,
    @SerializedName("class")
    val classX: String,
    @SerializedName("covidtested")
    val covidtested: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("destination")
    val destination: String,
    @SerializedName("friendlyStaff")
    val friendlyStaff: String,
    @SerializedName("hygenic")
    val hygenic: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String,
    @SerializedName("location")
    val location: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("premium")
    val premium: String,
    @SerializedName("price")
    val price: String,
    @SerializedName("rating")
    val rating: String,
    @SerializedName("time")
    val time: String,
    @SerializedName("veg")
    val veg: String,
    @SerializedName("1")
    val x1: String,
    @SerializedName("2")
    val x2: String,
    @SerializedName("3")
    val x3: String
):Parcelable