package com.beratagaca.worldcuisineapp.data.repo

import androidx.lifecycle.MutableLiveData
import com.beratagaca.worldcuisineapp.data.datasource.CountriesDataSource
import com.beratagaca.worldcuisineapp.data.datasource.FoodsDataSource
import com.beratagaca.worldcuisineapp.data.entity.Countries
import com.beratagaca.worldcuisineapp.data.entity.Foods

class FoodsRepository(var fds : FoodsDataSource) {
    fun getAllFoods() : MutableLiveData<List<Foods>> = fds.getAllFoods()
    fun getFoodsByCountryName(countryName : String) : MutableLiveData<List<Foods>> = fds.getFoodsByCountryId(countryName)
    fun saveFood(food: Foods) = fds.saveFood(food)
    fun deleteFoodByName(foodName : String) = fds.deleteFood(foodName)
}