// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.docker.core.di.module.httpmodule;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.OkHttpClient;

public final class HttpClientModule_ProvideClientBuilderFactory
    implements Factory<OkHttpClient.Builder> {
  private final HttpClientModule module;

  public HttpClientModule_ProvideClientBuilderFactory(HttpClientModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public OkHttpClient.Builder get() {
    return Preconditions.checkNotNull(
        module.provideClientBuilder(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OkHttpClient.Builder> create(HttpClientModule module) {
    return new HttpClientModule_ProvideClientBuilderFactory(module);
  }

  /** Proxies {@link HttpClientModule#provideClientBuilder()}. */
  public static OkHttpClient.Builder proxyProvideClientBuilder(HttpClientModule instance) {
    return instance.provideClientBuilder();
  }
}