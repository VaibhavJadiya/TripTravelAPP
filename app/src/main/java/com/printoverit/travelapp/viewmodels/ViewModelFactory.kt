package com.printoverit.travelapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.printoverit.travelapp.repositories.TravelRepository

class ViewModelFactory(private val travelRepository: TravelRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TravelViewModel(travelRepository) as T
    }
}