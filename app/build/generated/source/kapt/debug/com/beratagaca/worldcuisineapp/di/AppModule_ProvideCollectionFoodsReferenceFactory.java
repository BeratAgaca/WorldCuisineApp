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
public final class AppModule_ProvideCollectionFoodsReferenceFactory implements Factory<CollectionReference> {
  private final AppModule module;

  public AppModule_ProvideCollectionFoodsReferenceFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public CollectionReference get() {
    return provideCollectionFoodsReference(module);
  }

  public static AppModule_ProvideCollectionFoodsReferenceFactory create(AppModule module) {
    return new AppModule_ProvideCollectionFoodsReferenceFactory(module);
  }

  public static CollectionReference provideCollectionFoodsReference(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideCollectionFoodsReference());
  }
}
