package com.beratagaca.worldcuisineapp.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.beratagaca.worldcuisineapp.data.entity.Foods
import com.beratagaca.worldcuisineapp.data.repo.FoodsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CuisineViewModel @Inject constructor(var fRepo : FoodsRepository) : ViewModel() {
    var foodsList = MutableLiveData<List<Foods>>()


    init {

    }
    fun getAllFoods(){
        foodsList = fRepo.getAllFoods()
    }
    fun getFoodsByCountryName(countryName : String){
        foodsList = fRepo.getFoodsByCountryName(countryName)
    }
    fun saveFood(food: Foods) {
        fRepo.saveFood(food)
    }
    fun deleteFoodByName(foodName: String) {
        fRepo.deleteFoodByName(foodName = foodName)
    }


}