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
public abstract class CarTemp {
    private Colour colour;

    final void constructCar() throws IOException {
        addChasis();
        addAxels();
        addWheels();
        addEngine();
        addShell();
        if(colourWanted())
        {

            addColour();
        }
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

}
