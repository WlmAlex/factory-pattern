package com.gupao.factory;

import com.gupao.car.Car;

public class DefaultFactory extends AbstractFactory {

    private AudiFactory defaultFactory = new AudiFactory();

    @Override
    public Car getCar() {
        return defaultFactory.getCar();
    }
}
