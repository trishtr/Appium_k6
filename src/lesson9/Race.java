package lesson9;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class Race {

    public static void main(String[] args) {

        SecureRandom ran = new SecureRandom();
        Animal.Builder builder = new Animal.Builder();
        Animal tiger = builder.withanimalName("tiger")
                .withspeed(ran.nextInt(100))
                .withFlyable(false).build();
        Animal horse = builder.withanimalName("horse")
                .withspeed(ran.nextInt(75))
                .withFlyable(false).build();
        Animal dog = builder.withanimalName("dog")
                .withspeed(ran.nextInt(80))
                .withFlyable(false).build();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(tiger);
        animalList.add(horse);
        animalList.add(dog);
        String winner = animalList.get(0).getAnimalName();

        for(int i = 0; i < animalList.size()-1; i++){
            if(animalList.get(i).getSpeed() > animalList.get(i+1).getSpeed())
            {
                winner = animalList.get(i).getAnimalName();
            }
        }
        System.out.println("Winner is " + winner);

    }
}
