package lesson2;

import java.util.Scanner;

public class ScannerLearning {

    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in); //get keyboard
        System.out.print("Enter the number: ");
        int inputNumber = scanner.nextInt();
        System.out.print("Input number is " + inputNumber);



    }
}
