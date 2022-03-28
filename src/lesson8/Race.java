package lesson8;

import java.util.ArrayList;
import java.util.List;

public class Race extends Animal {

    public static void main(String [] args){
        Animal horse = new Horse();
        Animal tiger = new Tiger();
        Animal dog = new Dog();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(horse);
        animalList.add(tiger);
        animalList.add(dog);
        int maxSpeed = animalList.get(0).Speed();
        String winAnimal = animalList.get(0).getClass().getSimpleName();
        for(int i = 0; i < animalList.size()-1; i++) {
            if (animalList.get(i).Speed() > animalList.get(i + 1).Speed()) {
                maxSpeed = animalList.get(i).Speed();
                winAnimal = animalList.get(i).getClass().getSimpleName();
            }
        }
        System.out.println("Winner is " + winAnimal + " with speed  " + maxSpeed);

    }
}
