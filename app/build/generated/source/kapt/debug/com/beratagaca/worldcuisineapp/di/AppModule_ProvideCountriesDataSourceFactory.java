package com.beratagaca.worldcuisineapp.di;

import com.beratagaca.worldcuisineapp.data.datasource.CountriesDataSource;
import com.google.firebase.firestore.CollectionReference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("javax.inject.Named")
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
public final class AppModule_ProvideCountriesDataSourceFactory implements Factory<CountriesDataSource> {
  private final AppModule module;

  private final Provider<CollectionReference> collectionCountriesProvider;

  public AppModule_ProvideCountriesDataSourceFactory(AppModule module,
      Provider<CollectionReference> collectionCountriesProvider) {
    this.module = module;
    this.collectionCountriesProvider = collectionCountriesProvider;
  }

  @Override
  public CountriesDataSource get() {
    return provideCountriesDataSource(module, collectionCountriesProvider.get());
  }

  public static AppModule_ProvideCountriesDataSourceFactory create(AppModule module,
      Provider<CollectionReference> collectionCountriesProvider) {
    return new AppModule_ProvideCountriesDataSourceFactory(module, collectionCountriesProvider);
  }

  public static CountriesDataSource provideCountriesDataSource(AppModule instance,
      CollectionReference collectionCountries) {
    return Preconditions.checkNotNullFromProvides(instance.provideCountriesDataSource(collectionCountries));
  }
}
