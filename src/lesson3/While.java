package lesson3;

import java.security.SecureRandom;
import java.util.Scanner;

public class While {

    public static void main(String [] args){

        final int max_guess = 3 ;
        boolean isAnswerCorrect = false;
        int guessTime = 0;
        int luckNumber = new SecureRandom().nextInt(10);


        while(!isAnswerCorrect && guessTime < max_guess)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please enter your number");
            int guessNum =  scanner.nextInt();

            if(guessNum == luckNumber){
                System.out.print("Congrats");
                isAnswerCorrect = true;
            }
            else
            {
                guessTime ++;
            }

            if(guessTime == max_guess){
                System.out.println("See u next time");
            }
        }


    }
}
