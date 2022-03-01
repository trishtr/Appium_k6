package lesson2;

import java.util.Scanner;

public class Lab2_2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the number: ");

        int num = scanner.nextInt();

        if(num %2 != 0) {
            System.out.println("It is an odd number");
        }
        else
        {
            System.out.println("It is an even number");
        }

    }
}
