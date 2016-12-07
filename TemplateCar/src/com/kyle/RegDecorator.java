package com.kyle;

/**
 * Created by t00174978 on 07/12/2016.
 */
public abstract class RegDecorator {
    CarTemp carTemp;

    public RegDecorator(CarTemp temp) {
        this.carTemp = temp;
    }

    abstract void addReg();
}
