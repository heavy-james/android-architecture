package com.example.dagger2;

import dagger.Component;

@Component
public interface CarComponent {

    void inject(Car car);

    Car getCar();
}
