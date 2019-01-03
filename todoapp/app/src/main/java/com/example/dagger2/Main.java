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
        System.out.println("carA1 : " + carA1 + "; cylinderNumbers : " + carA1.getEngine().getCylinderNumbers());
        System.out.println("carA2 : " + carA2 + "; cylinderNumbers : " + carA2.getEngine().getCylinderNumbers());
        System.out.println("carA3 : " + carA3 + "; cylinderNumbers : " + carA3.getEngine().getCylinderNumbers() + "\n");

        Car carB1 = carComponent.getCarB();
        Car carB2 = carComponent.getCarB();
        Car carB3 = carComponent.getCarB();
        System.out.println("carB1 : " + carB1 +  "; cylinderNumbers : " + carB1.getEngine().getCylinderNumbers());
        System.out.println("carB2 : " + carB2 +  "; cylinderNumbers : " + carB2.getEngine().getCylinderNumbers());
        System.out.println("carB3 : " + carB3 +  "; cylinderNumbers : " + carB3.getEngine().getCylinderNumbers());
    }

    private static void testEngine(EngineComponent engineComponent){

        Engine engineA = engineComponent.getEngineA();
        System.out.println("engineA : " + engineA + "; cylinderNumbers : " + engineA.getCylinderNumbers() + "\n");

        Engine engineB = engineComponent.getEngineB();
        System.out.println("engineB : " + engineB + "; cylinderNumbers : " + engineB.getCylinderNumbers() + "\n");
    }
}