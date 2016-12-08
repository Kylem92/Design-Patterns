package com.kyle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Kyle on 22/11/2016.
 * this programme is to help the construction
 * of cars made by Volkswagen as Volkswagen also
 * own Audi and skoda which use the same components
 * in the construction of each brand but differ on the shell (i.e the exterior frame).
 * I also will also use addColour as a hook as it will give Volkswagen to add the colour
 * that has been ordered by a customer or to leave this method until a later date.
 */
public abstract class CarTemp implements DriveState {
    private Colour colour;
    private DriveState carState;

    final void constructCar() throws IOException {
        addChasis();
        addAxels();
        addWheels();
        addEngine();
        addShell();
        //factory
        System.out.println("Choose the spec for this car! ");
        String choice = null;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            choice = in.readLine();
        }catch (IOException e) {
            e.printStackTrace();
        }
        getSpec(choice).addSpec();


        if(colourWanted()) { addColour();}
    }

    private boolean colourWanted() {
        String answer = getAnswer();

        return answer.toLowerCase().startsWith("y");

    }

    private String getAnswer(){
        String answer = null;
        System.out.println("Does this car need to be painted? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "no";
        }
        return answer;

    }

    private final void addChasis() // final so subclass cant override it
    {
        System.out.println("Chasis has been built\n");
    }

    private final void addAxels()
    {
        System.out.println("Axels added to chasis\n");
    }

    private final void addWheels()
    {
        System.out.println("Wheels added to axels\n");
    }

    private final void addEngine()
    {
        System.out.println("Engine added to chasis\n");
    }

    abstract void addShell();

    private void addColour() throws IOException {System.out.println("Pick colour! ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String choice = in.readLine();

        if (choice.equalsIgnoreCase("Black")) {
            setColour(new Black());
            colour.sprayPaint();
        }
        else if (choice.equalsIgnoreCase("White")) {
            setColour(new White());
            colour.sprayPaint();
        }
    }//this was my intended hook method

    private void setColour(Colour colour){
        this.colour = colour;
    }

    public void setCarState(DriveState state)
    {
        this.carState=state;
    }

    public DriveState getState() {
        return this.carState;
    }

    @Override
    public void accelerate()
    {
        this.carState.accelerate();
    }

    @Override
    public void brake() { this.carState.brake();}

    @Override
    public void refuel() {this.carState.refuel();}

    @Override
    public void turnLeft(){this.carState.turnLeft();}

    @Override
    public void turnRight(){this.carState.turnRight();}

    private CarSpec getSpec(String choice)
    {
        if (choice.equalsIgnoreCase("Baseline")) {return new Baseline();}
        else if (choice.equalsIgnoreCase("Comfortline")){return new Comfortline();}
        else if (choice.equalsIgnoreCase("Highline")){return new Highline();}
        else if (choice.equalsIgnoreCase("Sportline")){return new Sportline();}
        else {return new Baseline();}
    }


}
