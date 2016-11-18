package com.kyle;

import java.util.ArrayList;

/**
 * Created by Kyle on 07/11/2016.
 */
public class Pelvis implements Joint, Subject {
    private ArrayList observers;
    private String name;
    private int pelvisAngle = 180; // straight line 180 degrees (standing straight)

    public Pelvis()
    {
        observers = new ArrayList();
    }

    @Override
    public void setName(String name) {
        this.name="Pelvis";
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0 ){
            observers.remove(i);
        }

    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer) observers.get(i);
            observer.update(pelvisAngle);
        }
    }

    public void angleChanged(){notifyObservers();}

    public void step()
    {
        System.out.println("Initiating Step");
        this.pelvisAngle -= 60; // angle closes by 60 degrees when pelvis initiates step (i.e.lifts leg)
        angleChanged();         // the angle is now 120 degrees between pelvis and femur
    }

    public static void main(String[] args){
        Pelvis pelvis = new Pelvis();
        Femur femur = new Femur(pelvis);

        Knee knee = new Knee(pelvis);

        Fibula fib = new Fibula(pelvis);

        Tibia tib = new Tibia(pelvis);

        Ankle ankle = new Ankle(pelvis);


        pelvis.step();
    }
}
