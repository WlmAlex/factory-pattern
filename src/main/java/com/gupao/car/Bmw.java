package com.gupao.car;

public class Bmw implements Car {
    @Override
    public Car getCar() {
        return new Bmw();
    }
}
