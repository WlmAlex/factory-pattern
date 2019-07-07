package com.gupao.car;

public class Audi implements Car {
    @Override
    public Car getCar() {
        return new Audi();
    }
}
