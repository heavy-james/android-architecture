package com.example.dagger2;

import javax.inject.Inject;

public class Car {

    String mName;

    Engine mEngine;

    @Inject
    public Car(Engine engine){
        mEngine = engine;
    }

    public String getName(){
        return mName;
    }

    Engine getEngine(){
        return mEngine;
    }

}
