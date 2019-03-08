package com.docker.core.di.module.httpmodule;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.HttpUrl;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HttpClientModule_ProvideHeaderFactory implements Factory<MHeader> {
  private final HttpClientModule module;

  private final Provider<HttpUrl> httpUrlProvider;

  public HttpClientModule_ProvideHeaderFactory(
      HttpClientModule module, Provider<HttpUrl> httpUrlProvider) {
    assert module != null;
    this.module = module;
    assert httpUrlProvider != null;
    this.httpUrlProvider = httpUrlProvider;
  }

  @Override
  public MHeader get() {
    return Preconditions.checkNotNull(
        module.provideHeader(httpUrlProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MHeader> create(
      HttpClientModule module, Provider<HttpUrl> httpUrlProvider) {
    return new HttpClientModule_ProvideHeaderFactory(module, httpUrlProvider);
  }
}
