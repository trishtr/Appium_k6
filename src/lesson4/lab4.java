package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class lab4 {


    public static void main(String[] args){

        List<Integer> myArray = new ArrayList<>();
        Random rd = new Random();
        myArray.add(rd.nextInt(50));
        myArray.add(rd.nextInt(50));
        myArray.add(rd.nextInt(50));
        myArray.add(rd.nextInt(50));
        myArray.add(rd.nextInt(50));

        System.out.println(myArray);
        int mx = myArray.get(0);
        int mn = myArray.get(0);
        for(int i= 0; i< myArray.size(); i++)
        {
            if(myArray.get(i) > mx )
            {
                mx = myArray.get(i);
            }
            if(myArray.get(i) < mn)
            {
                mn = myArray.get(i);
            }
        }

        System.out.println("Min: " + mn);
        System.out.println("Max: " + mx);
    }
}
