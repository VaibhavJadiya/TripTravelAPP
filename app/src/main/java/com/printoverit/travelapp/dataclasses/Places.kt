package com.printoverit.travelapp.dataclasses


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import kotlinx.android.parcel.RawValue

@Parcelize
data class Places(
    @SerializedName("Ajmer")
    val ajmer: @RawValue List<Ajmer>,
    @SerializedName("Beawar")
    val beawar: @RawValue List<Beawar>,
    @SerializedName("Bhilwara")
    val bhilwara: @RawValue List<Bhilwara>,
    @SerializedName("Bikaner")
    val bikaner: @RawValue List<Bikaner>,
    @SerializedName("Jaipur")
    val jaipur: @RawValue List<Jaipur>,
    @SerializedName("Jodhpur")
    val jodhpur: @RawValue List<Jodhpur>,
    @SerializedName("Kishangarh")
    val kishangarh: @RawValue List<Kishangarh>,
    @SerializedName("Kota")
    val kota: @RawValue List<Kota>,
    @SerializedName("Tonk")
    val tonk: @RawValue List<Tonk>,
    @SerializedName("Udaipur")
    val udaipur: @RawValue List<Udaipur>
):Parcelable