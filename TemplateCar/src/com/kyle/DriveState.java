package com.kyle;

/**
 * Created by t00174978 on 01/12/2016.
 */

public interface DriveState {
    void refuel();
    void brake();
    void accelerate();
    void turnLeft();
    void turnRight();
}
