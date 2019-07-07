package com.gupao.factory;

import com.gupao.car.Car;

public abstract class AbstractFactory {

    protected abstract Car getCar();

    public Car getCar(String name) {
        if ("bmw".equalsIgnoreCase(name)) {
            return new BmwFactory().getCar();
        } else if ("benz".equalsIgnoreCase(name)) {
            return new BenzFactory().getCar();
        } else if ("audi".equalsIgnoreCase(name)) {
            return new AudiFactory().getCar();
        } else {
            System.out.println("没有这个车");
            return null;
        }
    }
}
