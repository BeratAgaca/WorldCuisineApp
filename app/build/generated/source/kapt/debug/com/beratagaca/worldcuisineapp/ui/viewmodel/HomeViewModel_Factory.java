package com.beratagaca.worldcuisineapp.ui.viewmodel;

import com.beratagaca.worldcuisineapp.data.repo.CountriesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<CountriesRepository> cRepoProvider;

  public HomeViewModel_Factory(Provider<CountriesRepository> cRepoProvider) {
    this.cRepoProvider = cRepoProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(cRepoProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<CountriesRepository> cRepoProvider) {
    return new HomeViewModel_Factory(cRepoProvider);
  }

  public static HomeViewModel newInstance(CountriesRepository cRepo) {
    return new HomeViewModel(cRepo);
  }
}
