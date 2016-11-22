package com.kyle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Amanda on 22/11/2016.
 */
public class Volkswagen extends CarTemp {

    @Override
    void addShell() {
        System.out.println("Added Volkswagen shell");
    }

    @Override
    void addColour() {
        System.out.println("Pick a colour.... Strategy pattern goes in here");

    }



    public boolean colourWanted() {
        String answer = getAnswer();

        if(answer.toLowerCase().startsWith("y"))
        {
            return true;
        }else
        {
            return false;
        }

    }

    private String getAnswer(){
        String answer = null;
        System.out.println("Does this car need to be painted? ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        }catch (IOException e) {
            e.printStackTrace();
        }
        if (answer == null) {
            return "no";
        }
        return answer;

    }

}


