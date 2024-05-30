package com.beratagaca.worldcuisineapp.di;

import com.google.firebase.firestore.CollectionReference;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class AppModule_ProvideCollectionCountriesReferenceFactory implements Factory<CollectionReference> {
  private final AppModule module;

  public AppModule_ProvideCollectionCountriesReferenceFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public CollectionReference get() {
    return provideCollectionCountriesReference(module);
  }

  public static AppModule_ProvideCollectionCountriesReferenceFactory create(AppModule module) {
    return new AppModule_ProvideCollectionCountriesReferenceFactory(module);
  }

  public static CollectionReference provideCollectionCountriesReference(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCollectionCountriesReference());
  }
}
