package lesson3;

public class Array {

    public static void main(String[] args){
        int[] myArray = new int[5];

        for(int i = 0; i< myArray.length;)
        {
            myArray[i] = i++;
        }
       for (int i = 0; i< myArray.length; i ++)
       {
           System.out.println(myArray[i]);
       }//enhance for loop
       for (int j: myArray){
           System.out.println(j);
       }
    }
}
