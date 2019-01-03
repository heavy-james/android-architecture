package com.example.dagger2;

import com.example.dagger2.qualified.QualifierCarA;
import com.example.dagger2.qualified.QualifierCarB;
import com.example.dagger2.scope.ScopeCarA;
import com.example.dagger2.scope.ScopeCarB;

import dagger.Subcomponent;

@ScopeCarA
@ScopeCarB
@Subcomponent(modules = CarModule.class)
public interface CarComponent {

    @QualifierCarA
    Car getCarA();

    @QualifierCarB
    Car getCarB();

    @Subcomponent.Builder
    interface Builder{

        Builder carModule(CarModule module);

        CarComponent build();

    }
}
