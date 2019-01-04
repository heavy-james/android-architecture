package com.example.dagger2;

import javax.inject.Inject;

public class Mondeo extends Car {

    @Inject
    public Mondeo(Engine engine){
        super(engine);
        mName = "mondeo";
        engine.mCylinderNumbers = 8;
    }

}
