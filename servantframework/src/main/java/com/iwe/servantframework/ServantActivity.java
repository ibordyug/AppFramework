package com.iwe.servantframework;


import android.app.Activity;
import android.os.Bundle;
import android.os.PersistableBundle;

import com.iwe.servantframework.dagger.component.ActivityComponent;
import com.iwe.servantframework.dagger.component.DaggerActivityComponent;
import com.iwe.servantframework.dagger.module.ActivityModule;

/**
 * Created by vanya on 3/19/16.
 */
public class ServantActivity extends Activity {
    private ActivityComponent activityComponent;

    private void initializeDagger() {
        activityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((ServantApplication) getApplication()).getApplicationComponent())
                .build();
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        initializeDagger();
        super.onCreate(savedInstanceState, persistentState);
    }
}
