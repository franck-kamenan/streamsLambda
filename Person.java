package be.intecbrussel.streams;

import java.util.Random;

public class Person {
    public String name;
    public Passport passport;
    public int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;

        int rngNumber = new Random().nextInt(3);
        if(rngNumber == 0){
            passport = null;
        } else{
            passport = new Passport(name);
        }
    }
}
