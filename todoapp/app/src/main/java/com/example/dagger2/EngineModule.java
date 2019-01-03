package com.example.dagger2;

import com.example.dagger2.qualified.QualifierEngineA;
import com.example.dagger2.qualified.QualifierEngineB;
import com.example.dagger2.scope.ScopeEngineA;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = CarComponent.class)
public class EngineModule {

    @Provides
    @QualifierEngineA
    @ScopeEngineA
    Engine provideEngineA(){
        return new Engine(3);
    }

    @Provides
    @QualifierEngineB
    Engine provideEngineB(){
        return new Engine(5);
    }

}
