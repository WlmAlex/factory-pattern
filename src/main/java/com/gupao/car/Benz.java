package com.gupao.car;

public class Benz implements Car {
    @Override
    public Car getCar() {
        return new Benz();
    }
}
