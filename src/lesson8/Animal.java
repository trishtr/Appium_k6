package lesson8;

import java.security.SecureRandom;
import java.util.Random;

public abstract class Animal {

    public int Speed() {
        SecureRandom ran = new SecureRandom();
        int speed = ran.nextInt();
        return speed;
    }

    public Animal() {
    }


}

