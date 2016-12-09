package com.kyle;


import java.io.IOException;

/**
 * Created by Kyle on 22/11/2016.
 */
class CarTempDriver {
    public static void main (String[] args) throws IOException {
        Volkswagen vw = new Volkswagen();
        vw.constructCar();

        RegistrationPlate reg = new RegistrationPlate(vw);
        reg.addReg();

        System.out.println("\nTesting cars");

        StateFacade stateFacade = new StateFacade();
        //StateFacade.getInstance();
        //StateFacade stateFacade = new StateFacade.getInstance(); doesnt recognise getInstance method???
        stateFacade.testDrivingState(vw);
        stateFacade.testOutOfFuel(vw);
        stateFacade.testStoppedState(vw);
        stateFacade.testTurnLeft(vw);
        stateFacade.testTurnRight(vw);
       //StateFacade stateFacade1 = new StateFacade();
        //stateFacade1.testDrivingState(vw);
        //Audi car1 = new Audi();
        //car1.constructCar();

        //Skoda car2 = new Skoda();
        //car2.constructCar();




    }
}
