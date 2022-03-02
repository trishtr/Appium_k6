package lesson4;

import java.util.Scanner;

public class SingleMenu {

    public static void main(String[] args) {
        boolean isContinuing = true;

        while (isContinuing) {

            System.out.println("*******Menu*******");
            System.out.println("Input number");
            System.out.println("Print number list");
            System.out.println("Exit");

            Scanner scanner = new Scanner (System.in);
            int userInput = scanner.nextInt();

            if(userInput == 0)
            {
                isContinuing = false;
                System.out.println("Good bye!");
            }
            else
            {
                if(userInput ==1){
                    System.out.println("Enter num: ");
                }
                if(userInput ==2){
                    System.out.println("Print num: ");
                }
            }

        }
    }
}