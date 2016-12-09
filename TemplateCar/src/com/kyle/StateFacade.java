package com.kyle;

/**
 * Created by t00174978 on 07/12/2016.
 */
public class StateFacade {
    CarTemp carTest;
    private final DriveState drivingState;
    private final DriveState stoppedState;
    private final DriveState outFuel;
    private final DriveState leftState;
    private final DriveState rightState;

    private static  StateFacade instance;

    public StateFacade()
    {

        drivingState = new DrivingState();
        stoppedState= new StoppedState();
        outFuel = new OutOfFuelState();
        leftState = new TurnLeftState();
        rightState = new TurnRightState();
    }

    public static synchronized StateFacade getInstance()
    {if(instance == null){
        instance = new StateFacade();
    }
        return instance;
    }

    public void testDrivingState(CarTemp carTest)
    {
        carTest.setCarState(drivingState);
        System.out.println("\nTesting car in driving state\n");
        carTest.refuel();
        carTest.accelerate();
        carTest.turnLeft();
        carTest.turnRight();
        carTest.brake();
        carTest.setCarState(stoppedState);
    }

    public void testStoppedState(CarTemp carTest)
    {
        carTest.setCarState(stoppedState);
        System.out.println("\nTesting car in stopped state\n");
        carTest.refuel();
        carTest.brake();
        carTest.turnLeft();
        carTest.turnRight();
        carTest.accelerate();
        carTest.setCarState(drivingState);


    }

    public void testOutOfFuel(CarTemp carTest)
    {
        carTest.setCarState(outFuel);
        System.out.println("\nTesting car in out of fuel state\n");
        carTest.accelerate();
        carTest.turnLeft();
        carTest.turnRight();
        carTest.brake();
        carTest.refuel();
        carTest.setCarState(stoppedState);
    }

    public void testTurnRight(CarTemp carTest)
    {
        carTest.setCarState(rightState);
        System.out.println("\nTesting car turn right state\n");
        carTest.refuel();
        carTest.accelerate();
        carTest.turnLeft();
        carTest.turnRight();
        carTest.brake();
        carTest.setCarState(stoppedState);
    }

    public void testTurnLeft(CarTemp carTest)
    {
        carTest.setCarState(leftState);
        System.out.println("\nTesting car turn left state\n");
        carTest.refuel();
        carTest.accelerate();
        carTest.turnLeft();
        carTest.turnRight();
        carTest.brake();
        carTest.setCarState(stoppedState);
    }

}
