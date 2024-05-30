package com.beratagaca.worldcuisineapp.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\u0012\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\u0004H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\rH\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/beratagaca/worldcuisineapp/di/AppModule;", "", "()V", "provideCollectionCountriesReference", "Lcom/google/firebase/firestore/CollectionReference;", "provideCollectionFoodsReference", "provideCountriesDataSource", "Lcom/beratagaca/worldcuisineapp/data/datasource/CountriesDataSource;", "collectionCountries", "provideCountriesRepository", "Lcom/beratagaca/worldcuisineapp/data/repo/CountriesRepository;", "cds", "provideFoodsDataSource", "Lcom/beratagaca/worldcuisineapp/data/datasource/FoodsDataSource;", "collectionFoods", "provideFoodsRepository", "Lcom/beratagaca/worldcuisineapp/data/repo/FoodsRepository;", "fds", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @javax.inject.Named(value = "countries")
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.CollectionReference provideCollectionCountriesReference() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.beratagaca.worldcuisineapp.data.repo.CountriesRepository provideCountriesRepository(@org.jetbrains.annotations.NotNull
    com.beratagaca.worldcuisineapp.data.datasource.CountriesDataSource cds) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.beratagaca.worldcuisineapp.data.datasource.CountriesDataSource provideCountriesDataSource(@javax.inject.Named(value = "countries")
    @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference collectionCountries) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @javax.inject.Named(value = "foods")
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.CollectionReference provideCollectionFoodsReference() {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.beratagaca.worldcuisineapp.data.datasource.FoodsDataSource provideFoodsDataSource(@javax.inject.Named(value = "foods")
    @org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference collectionFoods) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.beratagaca.worldcuisineapp.data.repo.FoodsRepository provideFoodsRepository(@org.jetbrains.annotations.NotNull
    com.beratagaca.worldcuisineapp.data.datasource.FoodsDataSource fds) {
        return null;
    }
}