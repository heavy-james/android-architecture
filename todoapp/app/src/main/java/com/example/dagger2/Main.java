package com.example.dagger2;

public class Main {

    public static void main(String[] args) {
        EngineComponent engineComponent = DaggerEngineComponent.builder()
                .engineModule(new EngineModule()).tag("tagged success")
                .build();
        testCar(engineComponent);
        testEngine(engineComponent);
    }

    private static void testCar(EngineComponent engineComponent) {
        CarComponent carComponent = engineComponent.carComponent().build();
        Car carA = carComponent.getCarA();
        Car carB = carComponent.getCarB();
        System.out.println("carA : " + carA + "; name : " + carA.getName() + "; cylinders : " + carA.getEngine().getCylinderNumbers());
        System.out.println("carB : " + carB + "; name : " + carB.getName() + "; cylinders : " + carB.getEngine().getCylinderNumbers());
    }

    private static void testEngine(EngineComponent engineComponent) {
        
        System.out.println("EngineComponent tag : " + engineComponent.getTag());
        for (Engine engine : engineComponent.engineSet()) {
            System.out.print("engine in set : " + engine + "; cylinders : " + engine.getCylinderNumbers() + "\n");
        }
        for (Engine engine : engineComponent.engineMap().values()) {
            System.out.print("engine in map : " + engine + "; cylinders : " + engine.getCylinderNumbers() + "\n");
        }
    }
}