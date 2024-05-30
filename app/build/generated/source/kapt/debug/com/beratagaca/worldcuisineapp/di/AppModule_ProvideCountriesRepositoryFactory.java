package com.beratagaca.worldcuisineapp.di;

import com.beratagaca.worldcuisineapp.data.datasource.CountriesDataSource;
import com.beratagaca.worldcuisineapp.data.repo.CountriesRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_ProvideCountriesRepositoryFactory implements Factory<CountriesRepository> {
  private final AppModule module;

  private final Provider<CountriesDataSource> cdsProvider;

  public AppModule_ProvideCountriesRepositoryFactory(AppModule module,
      Provider<CountriesDataSource> cdsProvider) {
    this.module = module;
    this.cdsProvider = cdsProvider;
  }

  @Override
  public CountriesRepository get() {
    return provideCountriesRepository(module, cdsProvider.get());
  }

  public static AppModule_ProvideCountriesRepositoryFactory create(AppModule module,
      Provider<CountriesDataSource> cdsProvider) {
    return new AppModule_ProvideCountriesRepositoryFactory(module, cdsProvider);
  }

  public static CountriesRepository provideCountriesRepository(AppModule instance,
      CountriesDataSource cds) {
    return Preconditions.checkNotNullFromProvides(instance.provideCountriesRepository(cds));
  }
}
