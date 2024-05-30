package com.beratagaca.worldcuisineapp.data.datasource

import androidx.lifecycle.MutableLiveData
import com.beratagaca.worldcuisineapp.data.entity.Countries
import com.beratagaca.worldcuisineapp.data.entity.Foods
import com.google.firebase.firestore.CollectionReference

class CountriesDataSource(var collectionCountries : CollectionReference) {



    fun getAllCountries() : MutableLiveData<List<Countries>> {
        var countriesList = MutableLiveData<List<Countries>>()
        collectionCountries.get().addOnCompleteListener{
            val list = ArrayList<Countries>()
            for (d in it.result){
                val country = d.toObject(Countries::class.java)
                country.id = d.id
                list.add(country)
            }

            countriesList.value = list
        }

        return countriesList
    }

    fun saveCountry(name : String, flagPath : String, info : String){
        val newCountry = Countries("", name, flagPath, info)
       // collectionCountries.document().set(newCountry)
    }


    fun deleteCountry(country_id : String){
    }

}