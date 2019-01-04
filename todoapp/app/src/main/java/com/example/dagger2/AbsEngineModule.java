package com.example.dagger2;

import java.util.Map;
import java.util.Set;

import dagger.Module;
import dagger.multibindings.Multibinds;

@Module(subcomponents = CarComponent.class)
public abstract class AbsEngineModule {

    @Multibinds
    abstract Set<Engine> engineSet();


    @Multibinds
    abstract Map<String, Engine> engineMap();
}
