package com.example.dagger2;

import dagger.Component;

@Component(dependencies = EngineComponent.class)
public interface CarComponent {

    Car getCar();
}
