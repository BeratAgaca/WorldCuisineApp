package com.beratagaca.worldcuisineapp.data.repo

import androidx.lifecycle.MutableLiveData
import com.beratagaca.worldcuisineapp.data.datasource.CountriesDataSource
import com.beratagaca.worldcuisineapp.data.entity.Countries

class CountriesRepository(var cds : CountriesDataSource) {
    fun getAllCountries() : MutableLiveData<List<Countries>> = cds.getAllCountries()

    fun saveCountry(name : String, flagPath : String, info : String) = cds.saveCountry(name, flagPath, info)

    fun deleteCountry(countryId : String) = cds.deleteCountry(countryId)

}