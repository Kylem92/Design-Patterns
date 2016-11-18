package com.kyle;

/**
 * Created by Kyle on 07/11/2016.
 */
public class Knee implements Joint, Observer {
    private String name = "Knee";
    private int kneeAngle = 180; // standing straight
    private Subject pelvis;

    public Knee(Subject pelvis)
    {
        this.pelvis = pelvis;
        pelvis.register(this);
    }

    public void setKneeAngle(int angle){this.kneeAngle=angle;}

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(int pelvisAngle) {
        kneeAngle = pelvisAngle; //knee angle is equal to pelvis angle on the opposite side (i.e behind the knee)
        setKneeAngle(kneeAngle);
        System.out.println("Knee stepping");
    }
}
