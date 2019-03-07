package com.docker.common.widget;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.docker.common.R;
import com.docker.common.databinding.CommonEmptyViewBinding;


public class EmptyLayout extends LinearLayout {


    CommonEmptyViewBinding mbinding;

    public EmptyLayout(Context context) {
        super(context);
        initView(context);
    }

    public EmptyLayout(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initView(context);
    }

    public EmptyLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        setOrientation(LinearLayout.VERTICAL);
        mbinding = DataBindingUtil.inflate(LayoutInflater.from(context), R.layout.common_empty_view, this, true);
    }


    public void showLoading() {
        for (int i = 0; i < this.getChildCount(); i++) {
            if (this.getChildAt(i) == mbinding.commonEmptyCoutainer) {
                this.getChildAt(i).setVisibility(VISIBLE);
            } else {
                this.getChildAt(i).setVisibility(GONE);
            }
        }
        for (int i = 0; i < mbinding.commonEmptyCoutainer.getChildCount(); i++) {
            mbinding.commonEmptyCoutainer.getChildAt(i).setVisibility(GONE);
        }
        mbinding.commonLoadingView.setVisibility(VISIBLE);
        for (int i = 0; i < mbinding.commonLoadingView.getChildCount(); i++) {
            mbinding.commonLoadingView.getChildAt(i).setVisibility(VISIBLE);
        }

    }

    public void showError() {

        for (int i = 0; i < this.getChildCount(); i++) {
            if (this.getChildAt(i) == mbinding.commonEmptyCoutainer) {
                this.getChildAt(i).setVisibility(VISIBLE);
            } else {
                this.getChildAt(i).setVisibility(GONE);
            }
        }
        for (int i = 0; i < mbinding.commonEmptyCoutainer.getChildCount(); i++) {
            mbinding.commonEmptyCoutainer.getChildAt(i).setVisibility(GONE);
        }
        mbinding.commonErrView.setVisibility(VISIBLE);
        for (int i = 0; i < mbinding.commonErrView.getChildCount(); i++) {
            mbinding.commonErrView.getChildAt(i).setVisibility(VISIBLE);
        }

    }

    public void showNoData() {
        for (int i = 0; i < this.getChildCount(); i++) {
            if (this.getChildAt(i) == mbinding.commonEmptyCoutainer) {
                this.getChildAt(i).setVisibility(VISIBLE);
            } else {
                this.getChildAt(i).setVisibility(GONE);
            }
        }
        for (int i = 0; i < mbinding.commonEmptyCoutainer.getChildCount(); i++) {
            mbinding.commonEmptyCoutainer.getChildAt(i).setVisibility(GONE);
        }
        mbinding.commonEmptyView.setVisibility(VISIBLE);
        for (int i = 0; i < mbinding.commonEmptyView.getChildCount(); i++) {
            mbinding.commonEmptyView.getChildAt(i).setVisibility(VISIBLE);
        }
    }

    public void hide() {
        for (int i = 0; i < this.getChildCount(); i++) {
            if (this.getChildAt(i) == mbinding.commonEmptyCoutainer) {
                this.getChildAt(i).setVisibility(GONE);
            } else {
                this.getChildAt(i).setVisibility(VISIBLE);
            }
        }
    }

    /*
     * 点击重试留给外部调用
     * */
    public TextView getRetryView() {
        return mbinding.commonTvError;
    }

}
