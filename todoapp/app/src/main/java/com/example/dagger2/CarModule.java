package com.example.dagger2;

import com.example.dagger2.qualified.QualifierMondeo;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class CarModule {
    @Binds
    @QualifierMondeo
    abstract Car provideCarA(Mondeo mondeo);
}
