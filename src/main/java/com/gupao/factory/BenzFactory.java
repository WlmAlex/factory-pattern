package com.gupao.factory;

import com.gupao.car.Benz;
import com.gupao.car.Car;

public class BenzFactory extends AbstractFactory {
    @Override
    protected Car getCar() {
        return new Benz();
    }
}
