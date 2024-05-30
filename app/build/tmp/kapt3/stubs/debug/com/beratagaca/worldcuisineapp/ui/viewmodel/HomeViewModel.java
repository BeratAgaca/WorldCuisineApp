package com.beratagaca.worldcuisineapp.ui.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0011J\u001e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004R&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/beratagaca/worldcuisineapp/ui/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "cRepo", "Lcom/beratagaca/worldcuisineapp/data/repo/CountriesRepository;", "(Lcom/beratagaca/worldcuisineapp/data/repo/CountriesRepository;)V", "getCRepo", "()Lcom/beratagaca/worldcuisineapp/data/repo/CountriesRepository;", "setCRepo", "countriesList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/beratagaca/worldcuisineapp/data/entity/Countries;", "getCountriesList", "()Landroidx/lifecycle/MutableLiveData;", "setCountriesList", "(Landroidx/lifecycle/MutableLiveData;)V", "deleteCountries", "", "countryId", "", "getAllCountries", "saveCountries", "name", "flagPath", "info", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.beratagaca.worldcuisineapp.data.repo.CountriesRepository cRepo;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.beratagaca.worldcuisineapp.data.entity.Countries>> countriesList;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.beratagaca.worldcuisineapp.data.repo.CountriesRepository cRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.beratagaca.worldcuisineapp.data.repo.CountriesRepository getCRepo() {
        return null;
    }
    
    public final void setCRepo(@org.jetbrains.annotations.NotNull
    com.beratagaca.worldcuisineapp.data.repo.CountriesRepository p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.beratagaca.worldcuisineapp.data.entity.Countries>> getCountriesList() {
        return null;
    }
    
    public final void setCountriesList(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.beratagaca.worldcuisineapp.data.entity.Countries>> p0) {
    }
    
    public final void getAllCountries() {
    }
    
    public final void saveCountries(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String flagPath, @org.jetbrains.annotations.NotNull
    java.lang.String info) {
    }
    
    public final void deleteCountries(@org.jetbrains.annotations.NotNull
    java.lang.String countryId) {
    }
}