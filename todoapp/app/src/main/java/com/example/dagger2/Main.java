package com.example.dagger2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        EngineComponent engineComponent = DaggerEngineComponent.builder()
                .engineModule(new EngineModule())
                .build();

        testCar(engineComponent);
        testEngine(engineComponent);
    }

    private static void testCar(EngineComponent engineComponent) {

        final CarComponent carComponent = engineComponent.carComponent().carModule(new CarModule()).build();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Car carD = carComponent.getCarD();
                System.out.println("thread : " + Thread.currentThread().getName() + "; carD : " + carD);
            }
        };

        List<Thread> threads = new ArrayList<>(10);

        for(int i = 0; i < 10; i ++){
            Thread thread = new Thread(runnable);
            threads.add(thread);
        }

        for(Thread thread : threads){
            thread.start();
        }
    }

    private static void testEngine(EngineComponent engineComponent){

        Engine engineA = engineComponent.getEngineA();
        System.out.println("engineA : " + engineA + "; cylinderNumbers : " + engineA.getCylinderNumbers() + "\n");

        Engine engineB = engineComponent.getEngineB();
        System.out.println("engineB : " + engineB + "; cylinderNumbers : " + engineB.getCylinderNumbers() + "\n");
    }
}