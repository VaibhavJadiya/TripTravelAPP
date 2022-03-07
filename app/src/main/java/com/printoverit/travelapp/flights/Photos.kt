package com.printoverit.travelapp.flights


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Photos(
    @SerializedName("1")
    val x1: String,
    @SerializedName("2")
    val x2: String,
    @SerializedName("3")
    val x3: String
):Parcelable