package com.gupao.factory;

import com.gupao.car.Audi;
import com.gupao.car.Car;

public class AudiFactory extends AbstractFactory {
    @Override
    protected Car getCar() {
        return new Audi();
    }
}
