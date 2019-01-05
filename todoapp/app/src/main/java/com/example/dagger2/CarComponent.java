package com.example.dagger2;

import com.example.dagger2.qualified.QualifierCarA;
import com.example.dagger2.qualified.QualifierCarB;
import com.example.dagger2.qualified.QualifierCarC;
import com.example.dagger2.qualified.QualifierCarD;
import com.example.dagger2.scope.ScopeCarA;
import com.example.dagger2.scope.ScopeCarB;

import javax.inject.Singleton;

import dagger.Subcomponent;

@ScopeCarA
@ScopeCarB
@Singleton
@Subcomponent(modules = CarModule.class)
public interface CarComponent {

    @QualifierCarA
    Car getCarA();

    @QualifierCarB
    Car getCarB();

    @QualifierCarC
    Car getCarC();

    @QualifierCarD
    Car getCarD();


    @Subcomponent.Builder
    interface Builder{

        Builder carModule(CarModule module);

        CarComponent build();

    }
}
