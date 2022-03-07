package com.printoverit.travelapp.api

import com.printoverit.travelapp.flights.FlightRootDataClass
import com.printoverit.travelapp.hotel.HotelRootDataClass
import retrofit2.Response
import retrofit2.http.GET

interface HotelAPI {

    @GET("54e499a7-1768-4e95-8afc-677e3f0e8255")
    suspend fun getHotels(): Response<HotelRootDataClass>
}