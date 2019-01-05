package com.example.dagger2;

import com.example.dagger2.qualified.QualifierCarA;
import com.example.dagger2.qualified.QualifierCarB;
import com.example.dagger2.qualified.QualifierCarC;
import com.example.dagger2.qualified.QualifierCarD;
import com.example.dagger2.qualified.QualifierEngineA;
import com.example.dagger2.qualified.QualifierEngineB;
import com.example.dagger2.scope.ScopeCarA;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.Reusable;

@Module
public class CarModule {

    @Provides
    @ScopeCarA
    @QualifierCarA
    Car provideCarA(@QualifierEngineA Engine engine){
        return new Car(engine);
    }

    @Provides
    @QualifierCarB
    @Reusable
    Car provideCarB(@QualifierEngineB Engine engine){
        return new Car(engine);
    }

    @Provides
    @Singleton
    @QualifierCarC
    Car provideCarC(Engine engine){
        return new Car(engine);
    }

    @Provides
    @QualifierCarD
    @Reusable
    Car provideCarD(Engine engine){
        return new Car(engine);
    }
}
