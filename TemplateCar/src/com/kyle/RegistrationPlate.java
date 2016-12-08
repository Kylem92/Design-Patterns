package com.kyle;

/**
 * Created by t00174978 on 07/12/2016.
 */
class RegistrationPlate extends RegDecorator{


    public RegistrationPlate(CarTemp temp) {
        super(temp);
    }

    public void addReg() {
        int reg = (int) (Math.random()*10000);
        System.out.println("Car reg: 171 KY " + reg);
    }


}
