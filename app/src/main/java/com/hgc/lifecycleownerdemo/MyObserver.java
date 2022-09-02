package com.hgc.lifecycleownerdemo;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

/**
 * @Description TODO
 * @systemUser gchan2
 * @Author hanguangchuan
 * @Date 09-01-2022 周四 18:24
 */
public class MyObserver implements LifecycleObserver {

    private String TAG = "Lifecycle_Test";

    @OnLifecycleEvent(value = Lifecycle.Event.ON_CREATE)
    public void connect(){
        Log.i(TAG, "observer create: ");
    }

    @OnLifecycleEvent(value = Lifecycle.Event.ON_START)
    public void disConnect(){
        Log.i(TAG, "observer start: ");
    }
}
