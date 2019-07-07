package com.gupao;

import com.gupao.car.Car;
import com.gupao.factory.DefaultFactory;

public class FactoryTest {

    public static void main(String[] args) {
        DefaultFactory defaultFactory = new DefaultFactory();
        Car audi = defaultFactory.getCar("audi");
        System.out.println(audi);
    }
}
