package com.docker.core.util.callback;


import com.docker.core.repository.Resource;

/**
 * Created by zhangxindang on 2018/9/6.
 */

public abstract class CommonCallback<T> {

    public CommonCallback() {
    }

    /*
     * 缓存读取成功
     * */
    public void onCacheComplete(T Result) {
    }

    public void onComplete(Resource<T> resource) {
    }

    public void onComplete() {
    }

    public abstract void onBusinessError(Resource<T> resource);

    public abstract void onNetworkError(Resource<T> resource);
}
