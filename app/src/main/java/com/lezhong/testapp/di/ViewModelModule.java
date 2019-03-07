package com.lezhong.testapp.di;


import android.arch.lifecycle.ViewModel;

import com.docker.core.di.scope.ViewModelKey;
import com.lezhong.testapp.viewmodel.AccountViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by zhangxindang on 2018/11/21.
 */
@Module
public abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(AccountViewModel.class)
    abstract ViewModel AccountViewModel(AccountViewModel model);



}
