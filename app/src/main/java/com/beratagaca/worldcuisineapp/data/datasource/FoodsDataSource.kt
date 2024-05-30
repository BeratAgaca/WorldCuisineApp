package com.beratagaca.worldcuisineapp.data.datasource

import androidx.lifecycle.MutableLiveData
import com.beratagaca.worldcuisineapp.data.entity.Foods
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.toObject

class FoodsDataSource(var collectionFoods: CollectionReference) {

    fun getAllFoods() : MutableLiveData<List<Foods>> {
        val foodsList = MutableLiveData<List<Foods>>()
        collectionFoods.get().addOnCompleteListener{
            val list = ArrayList<Foods>()
            for (d in it.result){
                val food = d.toObject(Foods::class.java)
                food.id = d.id
                list.add(food)
            }

            foodsList.value = list
        }

        return foodsList
    }

    fun getFoodsByCountryId(countryName : String) : MutableLiveData<List<Foods>> {
        val foodsList = MutableLiveData<List<Foods>>()
        collectionFoods.whereEqualTo("country_name", countryName).get().addOnCompleteListener {
            if(it.isSuccessful){
                val list = ArrayList<Foods>()
                for(d in it.result){
                    val food = d.toObject(Foods::class.java)
                    food.id = d.id
                    list.add(food)
                }
                foodsList.value = list
            }
            else{
                //
            }
        }
        return foodsList
    }

    fun saveFood(food: Foods) {

    }
    fun deleteFood(name : String) {
    }

}