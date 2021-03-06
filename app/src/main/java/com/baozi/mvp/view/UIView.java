package com.baozi.mvp.view;

import android.content.res.Resources;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;

/**
 * Created by baozi on 2017/2/20.
 * 用户页面,操作页面，对应Activity,frgament...
 */

public interface UIView extends BaseView {
    /**
     * res资源获取
     *
     * @return
     */
    Resources getResources();

    /**
     * 根据id获得控件
     * 需要调用在initView()之后,否则会出现NullPointerException
     *
     * @param viewId
     * @param <V>
     * @return
     */

    <V extends View> V findView(@IdRes int viewId);

    /**
     * 回退
     */

    void onBackPressed();

    /**
     * 获取Activity
     *
     * @return
     */
    AppCompatActivity getAppcompatActivity();

    /**
     * 主要视图View
     *
     * @return
     */
    View getContentView();

    /**
     * 处理异常
     *
     * @param throwable
     */
    void onNewThrowable(Throwable throwable);

    Window getWindow();

    ActionBar getSupportActionBar();

    void setSupportActionBar(@Nullable Toolbar toolbar);

    void finishActivity();

}
