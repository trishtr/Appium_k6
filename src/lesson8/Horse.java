package lesson8;

import java.security.SecureRandom;

public class Horse extends Animal {

    @Override
    public int Speed() {
        SecureRandom ran = new SecureRandom();
        int hr_speed = ran.nextInt(75);
        return hr_speed;
    }

    public Horse() {

    }

}
