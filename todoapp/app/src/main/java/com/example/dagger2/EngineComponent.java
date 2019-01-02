package com.example.dagger2;

import dagger.Component;

@Component(modules = EngineModule.class)
public interface EngineComponent {

    Engine getEngine();

}
