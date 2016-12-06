package com.kyle;

/**
 * Created by t00174978 on 01/12/2016.
 */
public class StoppedState implements DriveState{
    @Override
    public void refuel() {

    }

    @Override
    public void brake() {
        System.out.println("Car is already stopped!");
    }

    @Override
    public void accelerate() {

    }

    @Override
    public void turnLeft() {
        System.out.println("Cannot turn left while car is stopped!");
    }

    @Override
    public void turnRight() {
        System.out.println("Cannot turn right while car is stopped!");
    }
}
