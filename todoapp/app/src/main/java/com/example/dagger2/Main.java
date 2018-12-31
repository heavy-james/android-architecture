package com.example.dagger2;

public class Main {

    public static void main(String[] args){

        Engine engine = new Engine(4);

        Car car = new Mondeo(engine);
    }
}
