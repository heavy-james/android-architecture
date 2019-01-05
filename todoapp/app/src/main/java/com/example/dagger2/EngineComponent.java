package com.example.dagger2;

import com.example.dagger2.qualified.QualifierEngineA;
import com.example.dagger2.qualified.QualifierEngineB;

import dagger.Component;


@Component(modules = EngineModule.class)
public interface EngineComponent {

    Engine getEngine();

    @QualifierEngineA
    Engine getEngineA();

    @QualifierEngineB
    Engine getEngineB();

    CarComponent.Builder carComponent();
}
