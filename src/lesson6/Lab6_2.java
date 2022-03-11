package lesson6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab6_2 {

    public static void main (String[] args)
    {
        String myPassword = "password123";
        boolean isContinue = true;
        int times = 0;

        while(isContinue) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your password");
            String userInput = scanner.nextLine();
            times ++;

            if(times >= 3)
            {
                isContinue = false;
            }

            if (userInput.equals(myPassword)) {
                    System.out.println("Your password is correct");
            } else {
                    System.out.println("Your password is incorrect");
            }

        }
    }
}
