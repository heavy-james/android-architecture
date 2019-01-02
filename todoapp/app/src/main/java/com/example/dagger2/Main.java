package com.example.dagger2;

public class Main {

    public static void main(String[] args){

        Car car = DaggerCarComponent.builder().build().getCar();

        System.out.println("cylinderNumbers : " + car.getEngine().getCylinderNumbers());

    }
}