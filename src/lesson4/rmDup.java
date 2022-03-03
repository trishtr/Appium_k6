package lesson4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class rmDup {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);

 /*       List<Integer> noDuArr = new ArrayList<>();

        for(Integer value: arr){
            if(!noDuArr.contains(value)){
                noDuArr.add(value);
            }
        }

  */
        Set<Integer> set = new HashSet<>(arr);
        List<Integer> rmDuArr= new ArrayList<>(set);

        for(Integer value:rmDuArr){
            System.out.println(value);
        }


    }
}
