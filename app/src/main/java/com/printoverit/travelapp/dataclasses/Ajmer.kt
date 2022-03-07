package com.printoverit.travelapp.dataclasses


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Ajmer(
    @SerializedName("hotelname")
    val hotelname: String,
    @SerializedName("hotelnumber")
    val hotelnumber: String,
    @SerializedName("id")
    val id: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("travelsname")
    val travelsname: String,
    @SerializedName("travelsnumber")
    val travelsnumber: String,
    @SerializedName("description")
    val description:String
):Parcelable