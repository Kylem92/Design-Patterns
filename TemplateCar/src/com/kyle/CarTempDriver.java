package com.kyle;

import java.io.IOException;

/**
 * Created by Kyle on 22/11/2016.
 */
public class CarTempDriver {
    public static void main (String[] args) throws IOException {
        Volkswagen car = new Volkswagen();
        car.constructCar();

        Audi car1 = new Audi();
        car1.constructCar();

        Skoda car2 = new Skoda();
        car2.constructCar();




    }
}
