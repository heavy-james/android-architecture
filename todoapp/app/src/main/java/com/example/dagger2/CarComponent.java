package com.example.dagger2;

import com.example.dagger2.qualified.QualifierMondeo;

import dagger.Subcomponent;

@Subcomponent(modules = CarModule.class)
public interface CarComponent {

    @QualifierMondeo
    Car getCarA();

    Car getCarB();

    @Subcomponent.Builder
    interface Builder{
        CarComponent build();
    }
}
