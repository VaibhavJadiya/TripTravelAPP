package com.printoverit.travelapp.repositories

import com.printoverit.travelapp.api.DaysAPI
import com.printoverit.travelapp.api.Flights
import com.printoverit.travelapp.api.HotelAPI
import com.printoverit.travelapp.api.TravelAPI
import com.printoverit.travelapp.dataclasses.RootDataClass
import com.printoverit.travelapp.days.DaysRootDataClass
import com.printoverit.travelapp.flights.FlightRootDataClass
import com.printoverit.travelapp.hotel.HotelRootDataClass
import com.printoverit.travelapp.trip.TripRootDataClass
import retrofit2.Response

class RemoteDataSource(private val travelAPI: TravelAPI , private val flights: Flights , private val hotelAPI: HotelAPI , private val daysAPI: DaysAPI) {

   suspend fun loadTravelPLaces():Response<RootDataClass>{
       return  travelAPI.getTravelLocations()
    }

    suspend fun loadFlights():Response<TripRootDataClass>{
        return flights.getFlights()
    }

    suspend fun loadHotels():Response<HotelRootDataClass>{
        return hotelAPI.getHotels()
    }

    suspend fun loadDays():Response<DaysRootDataClass>{
        return daysAPI.getDays()
    }
}