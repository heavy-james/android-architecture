package com.example.dagger2;

import dagger.Component;

@Component(modules = EngineModule.class)
public interface CarComponent {

    void inject(Car car);

    Car getCar();
}
