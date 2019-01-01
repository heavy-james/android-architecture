package com.example.dagger2;

import javax.inject.Inject;

public class Main {

    @Inject
    Car mCar;

    public static void main(String[] args){

        Car car = DaggerCarComponent.builder().build().getCar();

        System.out.println("cylinderNumbers : " + car.getEngine().getCylinderNumbers());

    }
}