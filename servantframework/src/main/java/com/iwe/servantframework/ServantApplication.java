package com.iwe.servantframework;

import android.app.Application;

import com.iwe.servantframework.dagger.component.ApplicationComponent;
import com.iwe.servantframework.dagger.component.DaggerApplicationComponent;
import com.iwe.servantframework.dagger.module.ApplicationModule;

/**
 * Created by vanya on 3/19/16.
 */
public class ServantApplication extends Application {
    private ApplicationComponent applicationComponent;

    private void initializeDagger() {
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        applicationComponent.inject(this);
    }

    @Override
    public void onCreate() {
        initializeDagger();
        super.onCreate();
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
