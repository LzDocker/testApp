package com.lezhong.testapp.viewmodel;

import android.arch.core.util.Function;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.Transformations;

import com.docker.core.base.BaseViewModel;
import com.docker.core.repository.Resource;
import com.lezhong.testapp.api.AccountService;
import com.lezhong.testapp.repository.AccountRepository;
import com.lezhong.testapp.vo.LoginParam;
import com.lezhong.testapp.vo.LoginVo;
import com.lezhong.testapp.vo.RegisterVo;

import javax.inject.Inject;

/**
 * Created by zhangxindang on 2018/10/19.
 */

public class AccountViewModel extends BaseViewModel {

    @Inject
    AccountService service;
    @Inject
    AccountRepository accountRepository;

    @Inject
    public AccountViewModel() {

    }

    private final MutableLiveData<LoginParam> paramlv = new MutableLiveData();
    public final LiveData<Resource<LoginVo>> loginlv =
            Transformations.switchMap(paramlv, new Function<LoginParam, LiveData<Resource<LoginVo>>>() {
                @Override
                public LiveData<Resource<LoginVo>> apply(LoginParam param) {
                    return accountRepository.Login(param.name, param.pwd);
                }
            });


    public void Login(String username, String pwd) {
        paramlv.setValue(new LoginParam(username, pwd));
    }


    /*
     * 注册
     * */
//    public LiveData<ApiResponse<BaseResponse<LoginVo>>> register(RegisterVo registerVo) {
//
//        return service.register(registerVo.getUsername().toString().trim(),
//                registerVo.getPassword().toString().trim(), registerVo.getRepassword().toString().trim());
//    }

    private final MutableLiveData<RegisterVo> registerParm = new MutableLiveData<>();

    public LiveData<Resource<LoginVo>> register(RegisterVo registerVo) {
        registerParm.setValue(registerVo);
        return  registVo;

    }

    public final LiveData<Resource<LoginVo>> registVo = Transformations.switchMap(registerParm, new Function<RegisterVo, LiveData<Resource<LoginVo>>>() {
        @Override
        public LiveData<Resource<LoginVo>> apply(RegisterVo input) {
            return accountRepository.registe(input.getUsername(), input.getPassword(), input.getRepassword());
        }
    });

}
