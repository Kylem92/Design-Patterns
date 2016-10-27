/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kyle;

/**
 *
 * @author t00174978
 */
public class Human {
    private String name;
    private String gender;
    private int age;
    private String species;
    
    public Human(String name, String gender, int age, String species){
        setName(name);
        setGender(gender);
        setAge(age);
        setSpecies(species);
        
    }

    private void setName(String name) {
        this.name=name;
    }

    private void setGender(String gender) {
        this.gender=gender;
    }

    private void setAge(int age) {
       this.age=age;
    }

    private void setSpecies(String species) {
        this.species=species;
    }
    
    
}
