package be.intecbrussel.streams;

import java.util.Random;

public class Passport {
    public String name;
    public boolean isValid;

    public Passport(String name){
        this.name = name;

        int rngNumber = new Random().nextInt(3);
        if(rngNumber == 0){
            isValid = false;
        } else{
            isValid = true;
        }
    }
}
