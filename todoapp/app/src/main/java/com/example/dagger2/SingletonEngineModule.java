package com.example.dagger2;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = CarComponent.class)
public class SingletonEngineModule {

    @Provides
    Engine provideEngine(){
        return new Engine(2);
    }

}
