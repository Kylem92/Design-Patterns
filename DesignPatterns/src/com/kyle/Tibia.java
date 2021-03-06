package com.kyle;



/**
 * Created by Kyle on 07/11/2016.
 */
public class Tibia implements Bone, Observer {
    private int size = 10;
    private String name = "Tibia";
    private int boneAngle = 0;
    private Subject pelvis;

    public Tibia(Subject pelvis)
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
        setBoneAngle(pelvisAngle); //tibia angle is equal to pelvis angle on the opposite side (i.e behind the knee)
        System.out.println("Tibia stepping");
    }
}
