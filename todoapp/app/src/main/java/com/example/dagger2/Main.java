package com.example.dagger2;

public class Main {

    public static void main(String[] args){

        Car car = DaggerEngineComponent.builder()
                .engineModule(new EngineModule())
                .build()
                .carComponent()
                .carModule(new CarModule())
                .build().getCar();

        System.out.println("cylinderNumbers : " + car.getEngine().getCylinderNumbers());
    }
}