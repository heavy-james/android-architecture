package com.example.dagger2;

import com.example.dagger2.qualified.QualifierCarA;
import com.example.dagger2.qualified.QualifierCarB;
import com.example.dagger2.qualified.QualifierEngineA;
import com.example.dagger2.qualified.QualifierEngineB;
import com.example.dagger2.scope.ScopeCarB;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    @QualifierCarA
    Car provideCarA(@QualifierEngineA Engine engine){
        return new Car(engine);
    }

    @Provides
    @QualifierCarB
    @ScopeCarB
    Car provideCarB(@QualifierEngineB Engine engine){
        return new Car(engine);
    }
}
