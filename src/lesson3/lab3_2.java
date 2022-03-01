package lesson3;

public class lab3_2 {

    public static void main (String[] args){
        int [] myArr ={1,2,3,4,5};

        int min= myArr[0];
        int max = myArr[0];

        for(int i = 0; i< myArr.length; i++)
        {
          if(myArr[i] <= min)
          {
              min = myArr[i];
          }
        }
        for(int j = 0; j< myArr.length; j++)
        {
            if(myArr[j] >= max)
            {
                max = myArr[j];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}
