package com.iwe.servantframework.dagger.module;

import com.iwe.servantframework.ServantActivity;

import dagger.Module;

/**
 * Created by vanya on 3/19/16.
 */
@Module
public class ActivityModule {
    private ServantActivity servantActivity;

    public ActivityModule(ServantActivity servantActivity) {
        this.servantActivity = servantActivity;
    }
}
