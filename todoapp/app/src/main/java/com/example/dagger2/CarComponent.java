package com.example.dagger2;

import dagger.Subcomponent;

@Subcomponent(modules = CarModule.class)
public interface CarComponent {

    Car getCar();

    @Subcomponent.Builder
    interface Builder{

        Builder carModule(CarModule module);

        CarComponent build();

    }
}
