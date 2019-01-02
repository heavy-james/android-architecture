package com.example.dagger2;

public class Main {

    public static void main(String[] args){

        EngineComponent engineComponent = DaggerEngineComponent.create();

        Car car = DaggerCarComponent.builder().engineComponent(engineComponent).build().getCar();

        System.out.println("cylinderNumbers : " + car.getEngine().getCylinderNumbers());
    }
}