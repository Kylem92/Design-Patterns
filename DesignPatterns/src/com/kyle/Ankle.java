package com.kyle;

/**
 * Created by Kyle on 07/11/2016.
 */
public class Ankle implements Joint, Observer {
    private String name = "Ankle";
    private int ankleAngle = 90; // standing straight
    private Subject pelvis;

    public Ankle(Subject pelvis)
    {
        this.pelvis = pelvis;
        pelvis.register(this);
    }

    public void setAnkleAngle(int angle){this.ankleAngle=angle;}

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(int pelvisAngle) {
        ankleAngle = pelvisAngle; //ankle angle is equal to pelvis angle on the same side (i.e in front of the ankle)
        setAnkleAngle(ankleAngle);
        System.out.println("Ankle stepping");
    }

}
