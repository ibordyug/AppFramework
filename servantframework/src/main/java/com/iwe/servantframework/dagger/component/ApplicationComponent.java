package com.iwe.servantframework.dagger.component;

import com.iwe.servantframework.ServantApplication;
import com.iwe.servantframework.dagger.component.api.ApplicationComponentApi;
import com.iwe.servantframework.dagger.module.ApplicationModule;

import dagger.Component;

/**
 * Created by vanya on 3/19/16.
 */
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent extends ApplicationComponentApi {
    void inject(ServantApplication application);
}
