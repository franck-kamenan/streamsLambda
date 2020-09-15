package be.intecbrussel.streams;

import java.util.function.Predicate;

public class BorderControlAgent {
    public boolean handleEntry(Predicate<Person> condition, Person person){

        if (condition.test(person)){
            System.out.println("Welcome to Arstotzka.");
            return true;
        } else{
            System.out.println("No entry for you!");
            return false;
        }

    }
}
