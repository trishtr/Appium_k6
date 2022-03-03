package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class lab4 {


    public static void main(String[] args) {

        List<Integer> myArray = new ArrayList<>();

        myArray.add(5);
        myArray.add(12);
        myArray.add(6);
        myArray.add(14);
        myArray.add(13);
        myArray.add(9);

        int min = myArray.get(0);
        int max = myArray.get(0);
        System.out.println(myArray);
        boolean isContinuing = true;

        while (isContinuing) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter index from 1 to 4 to add num: ");
            int input = scanner.nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("Enter desired num to add");


            for (int i = 0; i < myArray.size(); i++) {
                if (min < myArray.get(i)) {
                    min = myArray.get(i);
                } else if (max > myArray.get(i)) {
                    max = myArray.get(i);
                }
            }

            switch(input)
            {
                case 0 :
                    isContinuing = false;
                    System.out.println("empty entry");
                    break;
                case 1:
                    myArray.add(1,sc2.nextInt());
                    break;
                case 2:
                    myArray.add(2, sc2.nextInt());
                    break;
                case 3:
                    myArray.add(3, sc2.nextInt());
                    System.out.println("Min: " + min);
                    break;
                case 4:
                    myArray.add(4, sc2.nextInt());
                    System.out.println("Max: " + max);
                    break;
                default:
                    isContinuing = false;
                    System.out.println("Your num is out of range");
                    break;

            }

        }
    }
}
