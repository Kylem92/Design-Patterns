package com.kyle;


import java.io.IOException;

/**
 * Created by Kyle on 22/11/2016.
 */
public class CarTempDriver {
    public static void main (String[] args) throws IOException {
        Volkswagen vw = new Volkswagen();
        vw.constructCar();

        DriveState drivingState = new DrivingState();
        DriveState outOfFuelState = new OutOfFuelState();
        DriveState stoppedState = new StoppedState();
        DriveState turnLeftState = new TurnLeftState();
        DriveState turnRightState = new TurnRightState();

        vw.setCarState(drivingState);
        vw.accelerate();
        vw.setCarState(outOfFuelState);
        vw.setCarState(stoppedState);
        vw.setCarState(turnLeftState);
        vw.setCarState(turnRightState);




        //Audi car1 = new Audi();
        //car1.constructCar();

        //Skoda car2 = new Skoda();
        //car2.constructCar();




    }
}
