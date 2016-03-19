package com.iwe.servantframework.dagger.module;

import com.iwe.servantframework.ServantApplication;

import dagger.Module;

/**
 * Created by vanya on 3/19/16.
 */
@Module
public class ApplicationModule {
    private ServantApplication servantApplication;

    public ApplicationModule(ServantApplication servantApplication) {
        this.servantApplication = servantApplication;
    }
}
