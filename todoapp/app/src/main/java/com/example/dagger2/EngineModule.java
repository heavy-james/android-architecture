package com.example.dagger2;

import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.IntoSet;
import dagger.multibindings.StringKey;

@Module(subcomponents = CarComponent.class)
public class EngineModule {

    @Provides
    Engine provideEngine(){
        return new Engine(1);
    }

    @Provides
    @IntoSet
    Engine provideEngineIntoSet2(){
        return new Engine(2);
    }

    @Provides
    @IntoMap
    @StringKey("3")
    Engine provideEngineIntoMap3(){
        return new Engine(3);
    }
}
