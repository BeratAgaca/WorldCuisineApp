package com.beratagaca.worldcuisineapp.di;

import com.beratagaca.worldcuisineapp.data.datasource.FoodsDataSource;
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
public final class AppModule_ProvideFoodsDataSourceFactory implements Factory<FoodsDataSource> {
  private final AppModule module;

  private final Provider<CollectionReference> collectionFoodsProvider;

  public AppModule_ProvideFoodsDataSourceFactory(AppModule module,
      Provider<CollectionReference> collectionFoodsProvider) {
    this.module = module;
    this.collectionFoodsProvider = collectionFoodsProvider;
  }

  @Override
  public FoodsDataSource get() {
    return provideFoodsDataSource(module, collectionFoodsProvider.get());
  }

  public static AppModule_ProvideFoodsDataSourceFactory create(AppModule module,
      Provider<CollectionReference> collectionFoodsProvider) {
    return new AppModule_ProvideFoodsDataSourceFactory(module, collectionFoodsProvider);
  }

  public static FoodsDataSource provideFoodsDataSource(AppModule instance,
      CollectionReference collectionFoods) {
    return Preconditions.checkNotNullFromProvides(instance.provideFoodsDataSource(collectionFoods));
  }
}
