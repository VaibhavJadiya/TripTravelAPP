package com.printoverit.travelapp.api

import com.printoverit.travelapp.dataclasses.RootDataClass
import retrofit2.Response
import retrofit2.http.GET

interface TravelAPI {

    @GET("ab75469d-a72f-4706-a686-15c63698cacd")
    suspend fun getTravelLocations():Response<RootDataClass>
}