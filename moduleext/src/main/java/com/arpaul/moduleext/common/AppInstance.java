package com.arpaul.moduleext.common;

import android.app.Application;

import com.arpaul.modulemfe.component.DaggerMFEComponent;
import com.arpaul.modulemfe.component.MFEComponent;

public class AppInstance extends Application {

    static MFEComponent mfeComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mfeComponent = DaggerMFEComponent.builder().build();
    }

    public static MFEComponent getMfeComponent() {
        return mfeComponent;
    }
}
