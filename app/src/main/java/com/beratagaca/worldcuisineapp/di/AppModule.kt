package com.beratagaca.worldcuisineapp.di

import com.beratagaca.worldcuisineapp.data.datasource.CountriesDataSource
import com.beratagaca.worldcuisineapp.data.datasource.FoodsDataSource
import com.beratagaca.worldcuisineapp.data.repo.CountriesRepository
import com.beratagaca.worldcuisineapp.data.repo.FoodsRepository
import com.google.firebase.Firebase
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.firestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)

class AppModule {

    @Provides
    @Singleton
    @Named("countries")
    fun provideCollectionCountriesReference() : CollectionReference{
        return Firebase.firestore.collection("Countries")
    }

    @Provides
    @Singleton
    fun provideCountriesRepository(cds : CountriesDataSource) : CountriesRepository{
        return CountriesRepository(cds)
    }
    @Provides
    @Singleton
    fun provideCountriesDataSource(@Named("countries") collectionCountries : CollectionReference) : CountriesDataSource{
        return CountriesDataSource(collectionCountries)
    }


    @Provides
    @Singleton
    @Named("foods")
    fun provideCollectionFoodsReference() : CollectionReference{
        return Firebase.firestore.collection("Foods")
    }
    @Provides
    @Singleton
    fun provideFoodsDataSource(@Named("foods") collectionFoods : CollectionReference) : FoodsDataSource{
        return FoodsDataSource(collectionFoods)
    }
    @Provides
    @Singleton
    fun provideFoodsRepository(fds : FoodsDataSource) : FoodsRepository{
        return FoodsRepository(fds)
    }


}