package com.lezhong.testapp.api;

import android.arch.lifecycle.LiveData;

import com.docker.core.di.module.httpmodule.ApiResponse;
import com.docker.core.di.module.httpmodule.BaseResponse;
import com.lezhong.testapp.vo.LoginVo;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Streaming;

/**
 * Created by zhangxindang on 2018/10/22.
 */

public interface AccountService {


    @POST("user/register")
    @FormUrlEncoded
    LiveData<ApiResponse<BaseResponse<LoginVo>>> register(@Field("username") String username, @Field("password") String password, @Field("repassword") String repassword);


    @POST("user/login")
    @FormUrlEncoded
    LiveData<ApiResponse<BaseResponse<LoginVo>>> login(@Field("username") String username, @Field("password") String password);


    @GET("f2.market.xiaomi.com/download/AppStore/04275951df2d94fee0a8210a3b51ae624cc34483a/com.tencent.mm.apk")
    @Streaming
    Call<ResponseBody> downApk();
}
