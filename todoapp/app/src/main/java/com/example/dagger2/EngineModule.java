package com.example.dagger2;

import com.example.dagger2.qualified.QualifierEngineA;
import com.example.dagger2.qualified.QualifierEngineB;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = CarComponent.class)
public class EngineModule {

    @Provides
    Engine provideEngine(){
        return new Engine(1);
    }

    @Provides
    @QualifierEngineA
    Engine provideEngineA(){
        return new Engine(3);
    }

    @Provides
    @QualifierEngineB
    Engine provideEngineB(){
        return new Engine(5);
    }

}
