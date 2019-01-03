package com.example.dagger2;

import com.example.dagger2.qualified.QualifierEngineA;
import com.example.dagger2.qualified.QualifierEngineB;
import com.example.dagger2.scope.ScopeEngineA;
import com.example.dagger2.scope.ScopeEngineB;

import dagger.Component;

@ScopeEngineA
@ScopeEngineB
@Component(modules = EngineModule.class)
public interface EngineComponent {

    @QualifierEngineA
    Engine getEngineA();

    @QualifierEngineB
    Engine getEngineB();

    CarComponent.Builder carComponent();
}
