package com.docker.core.di.module.httpmodule;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class HttpClientModule_ProvideInterceptFactory implements Factory<Interceptor> {
  private final HttpClientModule module;

  private final Provider<RequestInterceptor> interceptorProvider;

  public HttpClientModule_ProvideInterceptFactory(
      HttpClientModule module, Provider<RequestInterceptor> interceptorProvider) {
    assert module != null;
    this.module = module;
    assert interceptorProvider != null;
    this.interceptorProvider = interceptorProvider;
  }

  @Override
  public Interceptor get() {
    return Preconditions.checkNotNull(
        module.provideIntercept(interceptorProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Interceptor> create(
      HttpClientModule module, Provider<RequestInterceptor> interceptorProvider) {
    return new HttpClientModule_ProvideInterceptFactory(module, interceptorProvider);
  }

  /** Proxies {@link HttpClientModule#provideIntercept(RequestInterceptor)}. */
  public static Interceptor proxyProvideIntercept(
      HttpClientModule instance, RequestInterceptor interceptor) {
    return instance.provideIntercept(interceptor);
  }
}
