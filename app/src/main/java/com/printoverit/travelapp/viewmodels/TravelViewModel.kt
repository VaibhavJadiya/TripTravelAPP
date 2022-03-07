package com.printoverit.travelapp.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.printoverit.travelapp.dataclasses.RootDataClass
import com.printoverit.travelapp.days.DaysRootDataClass
import com.printoverit.travelapp.flights.FlightRootDataClass
import com.printoverit.travelapp.hotel.HotelRootDataClass
import com.printoverit.travelapp.repositories.TravelRepository
import com.printoverit.travelapp.trip.TripRootDataClass
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class TravelViewModel(private val travelRepository: TravelRepository) :ViewModel() {

    fun loadTravelData(){
        viewModelScope.launch(Dispatchers.IO) {
            travelRepository.loadTravelPlaces()
        }
    }
    fun getTravelLiveData(): LiveData<RootDataClass> {
        return travelRepository.travelLiveData
    }

    fun loadFlightsData(){
        viewModelScope.launch(Dispatchers.IO) {
            travelRepository.loadFlights()
        }
    }
    fun getFlightLiveData():LiveData<TripRootDataClass>{
        return travelRepository.flightLiveData
    }

    fun loadHotels(){
        viewModelScope.launch(Dispatchers.IO) {
            travelRepository.loadHotels()
        }
    }
    fun getHotelLiveData():LiveData<HotelRootDataClass>{
        return travelRepository.hotelLiveData
    }

    fun loadDays(){
        viewModelScope.launch(Dispatchers.IO) {
            travelRepository.loadDays()
        }
    }

    fun getDaysLiveData():LiveData<DaysRootDataClass>{
        return travelRepository.daysLiveData
    }

}