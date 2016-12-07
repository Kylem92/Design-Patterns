package com.kyle;

/**
 * Created by Kyle on 22/11/2016.
 */
class Volkswagen extends CarTemp {


    @Override
    void addShell() {
        System.out.println("Added Volkswagen shell\n");
    }





   /* @Override
    void addColour() throws IOException {

        System.out.println("Pick colour! ");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String choice = in.readLine();

        if (choice.equalsIgnoreCase("Black")) {
            setColour(new Black());
            colour.sprayPaint();
        }
        else if (choice.equalsIgnoreCase("White")) {
            setColour(new White());
            colour.sprayPaint();
        }

    }*/ //this method was implemtation of intended hook
    // but due to the DRY principle i opted to put this in my CarTemp class



   /* public boolean colourWanted() {
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

    }*/

}


