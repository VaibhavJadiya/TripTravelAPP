package com.printoverit.travelapp.repositories

import android.content.Context
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.printoverit.travelapp.api.TravelAPI
import com.printoverit.travelapp.dataclasses.RootDataClass
import com.printoverit.travelapp.days.DaysRootDataClass
import com.printoverit.travelapp.flights.FlightRootDataClass
import com.printoverit.travelapp.hotel.HotelRootDataClass
import com.printoverit.travelapp.trip.TripRootDataClass
import com.printoverit.travelapp.utils.NetworkStatus.Companion.isNetworkAvailable

class TravelRepository(private val remoteDataSource: RemoteDataSource , private val context:Context) {

    var travelMutableData:MutableLiveData<RootDataClass> = MutableLiveData()
    val travelLiveData:LiveData<RootDataClass>
    get() = travelMutableData

    var flightMutableData:MutableLiveData<TripRootDataClass> = MutableLiveData()
    val flightLiveData:LiveData<TripRootDataClass>
    get() = flightMutableData

    var hotelMutableData:MutableLiveData<HotelRootDataClass> = MutableLiveData()
    val hotelLiveData:LiveData<HotelRootDataClass>
    get() = hotelMutableData

    var daysMutableData:MutableLiveData<DaysRootDataClass> = MutableLiveData()
    val daysLiveData:LiveData<DaysRootDataClass>
    get() = daysMutableData



    suspend fun loadTravelPlaces(){
        if(isNetworkAvailable(context)){
            if (remoteDataSource.loadTravelPLaces().body()!=null){
                travelMutableData.postValue(remoteDataSource.loadTravelPLaces().body())
            }
        }
        else{
            Log.d("TAG", "Internet Not Available")
        }
    }

    suspend fun loadFlights(){
        if (isNetworkAvailable(context)){
            if (remoteDataSource.loadFlights().body()!=null){
                flightMutableData.postValue(remoteDataSource.loadFlights().body())
            }
        }else{
            Log.d("TAG", "Internet Not Available")
        }
    }

    suspend fun loadHotels(){
        if (isNetworkAvailable(context)){
            if (remoteDataSource.loadHotels().body()!=null){
                hotelMutableData.postValue(remoteDataSource.loadHotels().body())
            }
        } else{
            Log.d("TAG", "Internet Not Available")
        }
    }
    suspend fun loadDays(){
        if (isNetworkAvailable(context)){
            if (remoteDataSource.loadDays().body()!=null){
                daysMutableData.postValue(remoteDataSource.loadDays().body())
            }
        } else{
            Log.d("TAG", "Internet Not Available")
        }
    }

}