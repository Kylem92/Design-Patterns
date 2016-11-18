package com.kyle;

/**
 * Created by Kyle on 07/11/2016.
 */
public class Femur implements Bone, Observer  {
    private int size = 10;
    private String name = "Femur";
    private int boneAngle = 0;
    private Subject pelvis;

    public Femur(Subject pelvis)
    {
        this.pelvis = pelvis;
        pelvis.register(this);
    }

    public void setBoneAngle(int angle){this.boneAngle=angle;}


    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setSize(int size) {
        this.size=size;
    }


    @Override
    public void update(int pelvisAngle) {
        setBoneAngle(pelvisAngle); //the femur and pelvis create and angle 120 degrees when stepping
        System.out.println("Femur stepping");
    }
}
