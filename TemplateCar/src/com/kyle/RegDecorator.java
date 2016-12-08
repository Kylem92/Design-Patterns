package com.kyle;

/**
 * Created by t00174978 on 07/12/2016.
 */
abstract class RegDecorator {
    private final CarTemp carTemp;

    RegDecorator(CarTemp temp) {
        this.carTemp = temp;
    }

    abstract void addReg();
}
