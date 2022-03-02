package lesson3;

import java.util.Arrays;

public class lab3_3 {

    public static void main(String[] args) {

        int[] myArray = {12, 34, 1, 16, 28};
        // Arrays.sort(myArray);
        int length = myArray.length;
        for(int i= 0; i< length; i ++)
        {
            for (int j = i; j < length; j++)
            {
                if(myArray[i] > myArray[j])
                {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        for(int k = 0; k< length; k++)
        {
            System.out.print(myArray[k] + " ");
        }


    }

    }

