package com.kyle;

/**
 * Created by t00174978 on 07/12/2016.
 */
public class StateFacade {
    CarTemp carTest;
    private DriveState drivingState;
    private DriveState stoppedState;
    private DriveState outFuel;
    private DriveState leftState;
    private DriveState rightState;

    public StateFacade()
    {

        drivingState = new DrivingState();
        stoppedState= new StoppedState();
        outFuel = new OutOfFuelState();
        leftState = new TurnLeftState();
        rightState = new TurnRightState();
    }

    public void testDrivingState(CarTemp carTest)
    {
        System.out.println("\nTesting car in driving state\n");
        drivingState.refuel();
        drivingState.accelerate();
        drivingState.turnLeft();
        drivingState.turnRight();
        drivingState.brake();
    }

    public void testStoppedState(CarTemp carTest)
    {
        System.out.println("\nTesting car in stopped state\n");
        stoppedState.refuel();
        stoppedState.accelerate();
        stoppedState.turnLeft();
        stoppedState.turnRight();
        stoppedState.brake();
    }

    public void testOutOfFuel(CarTemp carTest)
    {
        System.out.println("\nTesting car in out of fuel state\n");
        outFuel.accelerate();
        outFuel.turnLeft();
        outFuel.turnRight();
        outFuel.brake();
        outFuel.refuel();
    }

    public void testTurnRight(CarTemp carTest)
    {
        System.out.println("\nTesting car turn right state\n");
        rightState.refuel();
        rightState.accelerate();
        rightState.turnLeft();
        rightState.turnRight();
        rightState.brake();
    }

    public void testTurnLeft(CarTemp carTest)
    {
        System.out.println("\nTesting car turn left state\n");
        leftState.refuel();
        leftState.accelerate();
        leftState.turnLeft();
        leftState.turnRight();
        leftState.brake();
    }

}
