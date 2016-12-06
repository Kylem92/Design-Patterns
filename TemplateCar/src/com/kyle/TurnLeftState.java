package com.kyle;

/**
 * Created by t00174978 on 01/12/2016.
 */
public class TurnLeftState implements DriveState {
    @Override
    public void refuel() {
        System.out.println("Car has sufficient fuel!");
    }

    @Override
    public void brake() {
        System.out.println("Applying brakes, coming to a stop!");
    }

    @Override
    public void accelerate() {
        System.out.println("Car is going faster!");
    }

    @Override
    public void turnLeft() {
        System.out.println("Car is turning to the left!");
    }

    @Override
    public void turnRight() {
        System.out.println("Car is turning back to straight!");
    }
}
