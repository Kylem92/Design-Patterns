package com.kyle;

/**
 * Created by Kyle on 07/11/2016.
 */
public class Femur implements Bone {

    @Override
    public void setName(String name) {
        name = "femur";
    }

    @Override
    public void setSize(int size) {
        size = 10;
    }
}
