package lesson8;

import java.security.SecureRandom;

public class Dog extends Animal {

    public int Speed(){
        SecureRandom ran = new SecureRandom();
        int dog_speed = ran.nextInt(60);
        return dog_speed;
    }

    public Dog() {
    }
}
