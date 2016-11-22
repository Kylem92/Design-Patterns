package com.kyle;

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
    Colour colour;

    final void constructCar()
    {
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

    boolean colourWanted() {
        return true;
    }

    final void addChasis() // final so subclass cant override it
    {
        System.out.println("Chasis has been built");
    }

    final void addAxels()
    {
        System.out.println("Axels added to chasis");
    }

    final void addWheels()
    {
        System.out.println("Wheels added to axels");
    }

    final void addEngine()
    {
        System.out.println("Engine added to chasis");
    }

    abstract void addShell();

    abstract void addColour();//hook

    public void setColour(Colour colour){
        this.colour = colour;
    }

}
