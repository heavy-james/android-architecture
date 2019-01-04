package com.example.dagger2;

import java.util.Map;
import java.util.Set;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {EngineModule.class, AbsEngineModule.class})
public interface EngineComponent {

    String getTag();

    Set<Engine> engineSet();

    Map<String, Engine> engineMap();

    CarComponent.Builder carComponent();

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder tag(String tag);

        Builder engineModule(EngineModule engineModule);

        EngineComponent build();
    }
}
