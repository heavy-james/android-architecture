package com.example.dagger2;

public class Main {


    public static void main(String[] args) {

        EngineComponent engineComponent = DaggerEngineComponent.builder()
                .engineModule(new EngineModule())
                .build();

        testCar(engineComponent);

        testEngine(engineComponent);

    }

    private static void testCar(EngineComponent engineComponent) {

        CarComponent carComponent = engineComponent.carComponent().carModule(new CarModule()).build();

        Car carA1 = carComponent.getCarA();
        Car carA2 = carComponent.getCarA();
        Car carA3 = carComponent.getCarA();

        System.out.println("carA1 : " + carA1 + "; engine : " + carA1.getEngine() + "; cylinderNumbers : " + carA1.getEngine().getCylinderNumbers());
        System.out.println("carA2 : " + carA2 + "; engine : " + carA2.getEngine() + "; cylinderNumbers : " + carA2.getEngine().getCylinderNumbers());
        System.out.println("carA3 : " + carA3 + "; engine : " + carA3.getEngine() + "; cylinderNumbers : " + carA3.getEngine().getCylinderNumbers() + "\n");
        System.out.println("\n");

        Car carB1 = carComponent.getCarB();
        Car carB2 = carComponent.getCarB();
        Car carB3 = carComponent.getCarB();

        System.out.println("carB1 : " + carB1 + "; engine : " + carB1.getEngine() + "; cylinderNumbers : " + carB1.getEngine().getCylinderNumbers());
        System.out.println("carB2 : " + carB2 + "; engine : " + carB2.getEngine() + "; cylinderNumbers : " + carB2.getEngine().getCylinderNumbers());
        System.out.println("carB3 : " + carB3 + "; engine : " + carB3.getEngine() + "; cylinderNumbers : " + carB3.getEngine().getCylinderNumbers() + "\n");

    }

    private static void testEngine(EngineComponent engineComponent){

        Engine engineA1 = engineComponent.getEngineA();
        Engine engineA2 = engineComponent.getEngineA();
        Engine engineA3 = engineComponent.getEngineA();
        System.out.println("engineA1 : " + engineA1 + "; cylinderNumbers : " + engineA1.getCylinderNumbers());
        System.out.println("engineA2 : " + engineA2 + "; cylinderNumbers : " + engineA2.getCylinderNumbers());
        System.out.println("engineA3 : " + engineA3 + "; cylinderNumbers : " + engineA3.getCylinderNumbers() + "\n");

        Engine engineB1 = engineComponent.getEngineB();
        Engine engineB2 = engineComponent.getEngineB();
        Engine engineB3 = engineComponent.getEngineB();
        System.out.println("engineB1 : " + engineB1 + "; cylinderNumbers : " + engineB1.getCylinderNumbers());
        System.out.println("engineB2 : " + engineB2 + "; cylinderNumbers : " + engineB2.getCylinderNumbers());
        System.out.println("engineB3 : " + engineB3 + "; cylinderNumbers : " + engineB3.getCylinderNumbers() + "\n");
    }
}