package com.kyle;


import java.io.IOException;

/**
 * Created by Kyle on 22/11/2016.
 */
public class CarTempDriver {
    public static void main (String[] args) throws IOException {
        Volkswagen vw = new Volkswagen();
        vw.constructCar();

        RegistrationPlate reg = new RegistrationPlate(vw);
        reg.addReg();

        System.out.println("\nTesting cars");

        DriveState drivingState = new DrivingState();
        DriveState outOfFuelState = new OutOfFuelState();
        DriveState stoppedState = new StoppedState();
        DriveState turnLeftState = new TurnLeftState();
        DriveState turnRightState = new TurnRightState();

        System.out.println("\nTesting car in driving state\n");
        vw.setCarState(drivingState);
        vw.refuel();
        vw.accelerate();
        vw.turnLeft();
        vw.turnRight();
        vw.brake();

        System.out.println("\nTesting car in out of fuel state\n");
        vw.setCarState(outOfFuelState);
        vw.accelerate();
        vw.turnLeft();
        vw.turnRight();
        vw.brake();
        vw.refuel();

        System.out.println("\nTesting car in stopped state\n");
        vw.setCarState(stoppedState);
        vw.refuel();
        vw.accelerate();
        vw.turnLeft();
        vw.turnRight();
        vw.brake();

        System.out.println("\nTesting car turn left state\n");
        vw.setCarState(turnLeftState);
        vw.refuel();
        vw.accelerate();
        vw.turnLeft();
        vw.turnRight();
        vw.brake();

        System.out.println("\nTesting car turn right state");
        vw.setCarState(turnRightState);
        vw.refuel();
        vw.accelerate();
        vw.turnLeft();
        vw.turnRight();
        vw.brake();




        //Audi car1 = new Audi();
        //car1.constructCar();

        //Skoda car2 = new Skoda();
        //car2.constructCar();




    }
}
