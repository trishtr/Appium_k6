package lesson2;

import java.util.Scanner;

public class Lab2_1 {

    public static void main (String [] args){

        float weight;
        float height;

        float BMI;
        Scanner scanner1 = new Scanner(System.in);
        System.out.print("Please enter your weight: " );
        weight = scanner1.nextFloat();

        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter your height: ");
        height = scanner2.nextFloat();

        BMI = weight /(height*2);

        if(BMI <= 18.5)
        {
            System.out.println("Lightweight");
        }
        else if (BMI >= 18.5 && BMI <=24.9)
        {
            System.out.println("Normal weight");
        }
        else if (BMI >=25 && BMI <= 29.9)
        {
            System.out.println("Overweight");
        }
        else
        {
            System.out.println("Obesity");
        }
    }
}
