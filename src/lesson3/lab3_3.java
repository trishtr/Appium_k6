package lesson3;

import java.util.Arrays;

public class lab3_3 {

    public static void main(String[] args) {

        int [] myArray = {12,34,1,16,28};
        Arrays.sort(myArray);

       for (int i = 0; i< myArray.length; i ++){
            System.out.print(myArray[i] + " ");
       }
    }
}
