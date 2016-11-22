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

    final void constructCar()
    {
        addChasis();
        addAxels();
        addWheels();
        addEngine();
        addShell();
        addColour();
    }

    void addChasis()
    {

    }

    void addAxels()
    {

    }

    void addWheels()
    {

    }

    void addEngine()
    {

    }

    abstract void addShell();

    void addColour(){} //hook

}
