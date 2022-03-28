package lesson8;

import java.security.SecureRandom;

public class Tiger extends Animal {

    @Override
    public int Speed(){
        SecureRandom ran = new SecureRandom();
        int tiger_speed = ran.nextInt(100);
        return tiger_speed;
    }

    public Tiger() {
    }
}
