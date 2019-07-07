package com.gupao.factory;

import com.gupao.car.Bmw;
import com.gupao.car.Car;

public class BmwFactory extends AbstractFactory {
    @Override
    protected Car getCar() {
        return new Bmw();
    }
}
