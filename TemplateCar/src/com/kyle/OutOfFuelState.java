package com.kyle;

/**
 * Created by t00174978 on 01/12/2016.
 */
public class OutOfFuelState implements DriveState {
    @Override
    public void refuel() {
        System.out.println("Refueling!");
    }

    @Override
    public void brake() {
        System.out.println("Brakes are applied and car is out of fuel!");
    }

    @Override
    public void accelerate() {
        System.out.println("No fuel cannot drive!");
    }

    @Override
    public void turnLeft() {
        System.out.println("No fuel cannot turn left!");
    }

    @Override
    public void turnRight() {
        System.out.println("No fuel cannot turn right!");
    }
}
