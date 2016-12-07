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

        StateFacade stateFacade = new StateFacade();
        stateFacade.testDrivingState(vw);
        stateFacade.testOutOfFuel(vw);
        stateFacade.testStoppedState(vw);
        stateFacade.testTurnLeft(vw);
        stateFacade.testTurnRight(vw);
       /* DriveState drivingState = new DrivingState();
        DriveState outOfFuelState = new OutOfFuelState();
        DriveState stoppedState = new StoppedState();
        DriveState turnLeftState = new TurnLeftState();
        DriveState turnRightState = new TurnRightState();


        vw.setCarState(drivingState);
        vw.refuel();
        vw.accelerate();
        vw.turnLeft();
        vw.turnRight();
        vw.brake();


        vw.setCarState(outOfFuelState);
        vw.accelerate();
        vw.turnLeft();
        vw.turnRight();
        vw.brake();
        vw.refuel();


        vw.setCarState(stoppedState);
        vw.refuel();
        vw.accelerate();
        vw.turnLeft();
        vw.turnRight();
        vw.brake();


        vw.setCarState(turnLeftState);
        vw.refuel();
        vw.accelerate();
        vw.turnLeft();
        vw.turnRight();
        vw.brake();


        vw.setCarState(turnRightState);
        vw.refuel();
        vw.accelerate();
        vw.turnLeft();
        vw.turnRight();
        vw.brake();*/




        //Audi car1 = new Audi();
        //car1.constructCar();

        //Skoda car2 = new Skoda();
        //car2.constructCar();




    }
}
