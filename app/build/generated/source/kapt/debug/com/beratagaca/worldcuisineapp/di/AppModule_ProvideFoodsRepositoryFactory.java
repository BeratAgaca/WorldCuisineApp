package com.beratagaca.worldcuisineapp.di;

import com.beratagaca.worldcuisineapp.data.datasource.FoodsDataSource;
import com.beratagaca.worldcuisineapp.data.repo.FoodsRepository;
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
public final class AppModule_ProvideFoodsRepositoryFactory implements Factory<FoodsRepository> {
  private final AppModule module;

  private final Provider<FoodsDataSource> fdsProvider;

  public AppModule_ProvideFoodsRepositoryFactory(AppModule module,
      Provider<FoodsDataSource> fdsProvider) {
    this.module = module;
    this.fdsProvider = fdsProvider;
  }

  @Override
  public FoodsRepository get() {
    return provideFoodsRepository(module, fdsProvider.get());
  }

  public static AppModule_ProvideFoodsRepositoryFactory create(AppModule module,
      Provider<FoodsDataSource> fdsProvider) {
    return new AppModule_ProvideFoodsRepositoryFactory(module, fdsProvider);
  }

  public static FoodsRepository provideFoodsRepository(AppModule instance, FoodsDataSource fds) {
    return Preconditions.checkNotNullFromProvides(instance.provideFoodsRepository(fds));
  }
}
