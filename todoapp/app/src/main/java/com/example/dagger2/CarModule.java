package com.example.dagger2;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {
    @Provides
    Car provideCar(Engine engine){
        return new Car(engine);
    }
}
