package com.printoverit.travelapp.trip


import com.google.gson.annotations.SerializedName

data class Flights(
    @SerializedName("Dubai")
    val dubai: List<Dubai>,
    @SerializedName("Japan")
    val japan: List<Japan>,
    @SerializedName("Malaysia")
    val malaysia: List<Malaysia>,
    @SerializedName("Philippines")
    val philippines: List<Philippine>,
    @SerializedName("South Korea")
    val southKorea: List<SouthKorea>,
    @SerializedName("USA")
    val uSA: List<USA>
)