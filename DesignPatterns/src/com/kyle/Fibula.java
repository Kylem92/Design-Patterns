package com.kyle;




/**
 * Created by Kyle on 07/11/2016.
 */
public class Fibula implements Bone, Observer {
    private int size = 10;
    private String name = "Fibula";
    private int boneAngle = 0;
    private Subject pelvis;

    public Fibula(Subject pelvis)
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
        setBoneAngle(pelvisAngle); //fibula angle is equal to pelvis angle on the opposite side (i.e behind the knee)
        System.out.println("Fibula stepping");
    }
}

