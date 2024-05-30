package com.beratagaca.worldcuisineapp.data.datasource;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u000bJ\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u0014"}, d2 = {"Lcom/beratagaca/worldcuisineapp/data/datasource/FoodsDataSource;", "", "collectionFoods", "Lcom/google/firebase/firestore/CollectionReference;", "(Lcom/google/firebase/firestore/CollectionReference;)V", "getCollectionFoods", "()Lcom/google/firebase/firestore/CollectionReference;", "setCollectionFoods", "deleteFood", "", "name", "", "getAllFoods", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/beratagaca/worldcuisineapp/data/entity/Foods;", "getFoodsByCountryId", "countryName", "saveFood", "food", "app_debug"})
public final class FoodsDataSource {
    @org.jetbrains.annotations.NotNull
    private com.google.firebase.firestore.CollectionReference collectionFoods;
    
    public FoodsDataSource(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference collectionFoods) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.firebase.firestore.CollectionReference getCollectionFoods() {
        return null;
    }
    
    public final void setCollectionFoods(@org.jetbrains.annotations.NotNull
    com.google.firebase.firestore.CollectionReference p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.beratagaca.worldcuisineapp.data.entity.Foods>> getAllFoods() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.beratagaca.worldcuisineapp.data.entity.Foods>> getFoodsByCountryId(@org.jetbrains.annotations.NotNull
    java.lang.String countryName) {
        return null;
    }
    
    public final void saveFood(@org.jetbrains.annotations.NotNull
    com.beratagaca.worldcuisineapp.data.entity.Foods food) {
    }
    
    public final void deleteFood(@org.jetbrains.annotations.NotNull
    java.lang.String name) {
    }
}