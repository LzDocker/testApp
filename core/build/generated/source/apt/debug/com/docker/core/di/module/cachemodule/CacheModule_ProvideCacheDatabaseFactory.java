package com.docker.core.di.module.cachemodule;

import com.docker.core.base.BaseApplication;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class CacheModule_ProvideCacheDatabaseFactory implements Factory<CacheDatabase> {
  private final CacheModule module;

  private final Provider<BaseApplication> applicationProvider;

  public CacheModule_ProvideCacheDatabaseFactory(
      CacheModule module, Provider<BaseApplication> applicationProvider) {
    assert module != null;
    this.module = module;
    assert applicationProvider != null;
    this.applicationProvider = applicationProvider;
  }

  @Override
  public CacheDatabase get() {
    return Preconditions.checkNotNull(
        module.provideCacheDatabase(applicationProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<CacheDatabase> create(
      CacheModule module, Provider<BaseApplication> applicationProvider) {
    return new CacheModule_ProvideCacheDatabaseFactory(module, applicationProvider);
  }

  /** Proxies {@link CacheModule#provideCacheDatabase(BaseApplication)}. */
  public static CacheDatabase proxyProvideCacheDatabase(
      CacheModule instance, BaseApplication application) {
    return instance.provideCacheDatabase(application);
  }
}
