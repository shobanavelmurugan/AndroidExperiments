package com.innobot.dagger2example;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by innobot-linux-7 on 20/8/19,20,AndroidExperiments.
 */
@Module
public class AppModule {
    private Application mApplication;

    AppModule(Application mApplication) {
        this.mApplication=mApplication;
    }

    @Provides
    @Singleton
    Application provideApplication() {
        return mApplication;
    }
}
