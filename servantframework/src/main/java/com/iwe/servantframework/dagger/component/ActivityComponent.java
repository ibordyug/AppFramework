package com.iwe.servantframework.dagger.component;

import com.iwe.servantframework.ServantActivity;
import com.iwe.servantframework.dagger.component.api.ActivityComponentApi;
import com.iwe.servantframework.dagger.module.ActivityModule;

import dagger.Component;

/**
 * Created by vanya on 3/19/16.
 */
@Component(modules = {ActivityModule.class}, dependencies = {ApplicationComponent.class})
public interface ActivityComponent extends ActivityComponentApi {
    void inject(ServantActivity activity);
}
