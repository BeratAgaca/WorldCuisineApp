package com.beratagaca.worldcuisineapp.ui.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.beratagaca.worldcuisineapp.data.entity.Countries
import com.beratagaca.worldcuisineapp.data.repo.CountriesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(var cRepo : CountriesRepository) : ViewModel(){

    var countriesList = MutableLiveData<List<Countries>>()

    init {
        getAllCountries()
    }

    fun getAllCountries(){
        countriesList = cRepo.getAllCountries()
    }

    fun saveCountries(name : String, flagPath : String, info : String){
        cRepo.saveCountry(name , flagPath , info )
    }

    fun deleteCountries(countryId : String){
        cRepo.deleteCountry(countryId)
    }


}