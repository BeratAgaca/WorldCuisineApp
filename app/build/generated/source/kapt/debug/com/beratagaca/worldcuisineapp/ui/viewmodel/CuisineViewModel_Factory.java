package com.beratagaca.worldcuisineapp.ui.viewmodel;

import com.beratagaca.worldcuisineapp.data.repo.FoodsRepository;
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
public final class CuisineViewModel_Factory implements Factory<CuisineViewModel> {
  private final Provider<FoodsRepository> fRepoProvider;

  public CuisineViewModel_Factory(Provider<FoodsRepository> fRepoProvider) {
    this.fRepoProvider = fRepoProvider;
  }

  @Override
  public CuisineViewModel get() {
    return newInstance(fRepoProvider.get());
  }

  public static CuisineViewModel_Factory create(Provider<FoodsRepository> fRepoProvider) {
    return new CuisineViewModel_Factory(fRepoProvider);
  }

  public static CuisineViewModel newInstance(FoodsRepository fRepo) {
    return new CuisineViewModel(fRepo);
  }
}
