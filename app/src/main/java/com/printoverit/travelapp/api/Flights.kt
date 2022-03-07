package com.printoverit.travelapp.api

import com.printoverit.travelapp.dataclasses.RootDataClass
import com.printoverit.travelapp.flights.FlightRootDataClass
import com.printoverit.travelapp.trip.TripRootDataClass
import retrofit2.Response
import retrofit2.http.GET

interface Flights {

   // @GET("422197bf-7108-4afe-99b3-f63934413edc")
    @GET("cde4b39d-e742-48a0-a665-b72ca6ea56e6")
    suspend fun getFlights(): Response<TripRootDataClass>
}