package com.printoverit.travelapp.api

import com.printoverit.travelapp.days.DaysRootDataClass
import com.printoverit.travelapp.trip.TripRootDataClass
import retrofit2.Response
import retrofit2.http.GET

interface DaysAPI {

    @GET("d64af077-cb4f-4b84-b13f-ac959c70cb3e")
    suspend fun getDays(): Response<DaysRootDataClass>
}