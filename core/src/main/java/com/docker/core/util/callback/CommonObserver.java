package com.docker.core.util.callback;

import android.support.annotation.Nullable;

import com.docker.core.repository.Resource;


/**
 * Created by zhangxindang on 2018/9/6.
 */

public class CommonObserver<T> implements android.arch.lifecycle.Observer<Resource<T>> {
    private CommonCallback<T> netBoundCallback;

    public CommonObserver(CommonCallback<T> netBoundCallback) {
        this.netBoundCallback = netBoundCallback;
    }

    @Override
    public void onChanged(@Nullable Resource<T> tResource) {

        switch (tResource.status) {
            case LOADING:
                if (tResource.data != null) {
                    netBoundCallback.onCacheComplete(tResource.data);
                }
                break;
            case SUCCESS:
                netBoundCallback.onComplete(tResource);
                break;
            case BUSSINESSERROR:
                netBoundCallback.onComplete();
                netBoundCallback.onBusinessError(tResource);
                break;
            case ERROR:
                netBoundCallback.onComplete();
                netBoundCallback.onNetworkError(tResource);
                break;
        }
    }
}
