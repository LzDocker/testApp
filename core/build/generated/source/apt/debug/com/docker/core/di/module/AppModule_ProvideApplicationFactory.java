package com.docker.core.di.module;

import com.docker.core.base.BaseApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AppModule_ProvideApplicationFactory implements Factory<BaseApplication> {
  private final AppModule module;

  public AppModule_ProvideApplicationFactory(AppModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public BaseApplication get() {
    return Preconditions.checkNotNull(
        module.provideApplication(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<BaseApplication> create(AppModule module) {
    return new AppModule_ProvideApplicationFactory(module);
  }
}
