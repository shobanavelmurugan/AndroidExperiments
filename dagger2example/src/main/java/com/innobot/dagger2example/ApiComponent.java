package com.innobot.dagger2example;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules={AppModule.class, ApiModule.class})
public interface ApiComponent {
    void inject1(MainActivity activity);
}