package com.printoverit.travelapp.utils

import android.app.Application
import com.printoverit.travelapp.api.DaysAPI
import com.printoverit.travelapp.api.Flights
import com.printoverit.travelapp.api.HotelAPI
import com.printoverit.travelapp.api.TravelAPI
import com.printoverit.travelapp.network.RetrofitInstance
import com.printoverit.travelapp.repositories.RemoteDataSource
import com.printoverit.travelapp.repositories.TravelRepository

class MyApplication() : Application() {

    lateinit var repository: TravelRepository
    override fun onCreate() {
        super.onCreate()
        val api=RetrofitInstance.getRetrofitInstance().create(TravelAPI::class.java)
        val flightapi=RetrofitInstance.getRetrofitInstance().create(Flights::class.java)
        val hotelAPi=RetrofitInstance.getRetrofitInstance().create(HotelAPI::class.java)
        val daysAPI=RetrofitInstance.getRetrofitInstance().create(DaysAPI::class.java)
        val remoteData=RemoteDataSource(api,flightapi,hotelAPi,daysAPI)
        repository=TravelRepository(remoteData,applicationContext)
    }
}