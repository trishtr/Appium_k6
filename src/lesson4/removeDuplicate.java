package lesson4;

import java.util.ArrayList;
import java.util.List;

public class removeDuplicate {
    public static void main(String[] args) {

        List<Integer> arrList = new ArrayList<>();
        arrList.add(1);
        arrList.add(1);
        arrList.add(2);
        arrList.add(2);
        arrList.add(3);
        arrList.add(4);


        for (int i = 0; i < arrList.size()-1; i++) {
            if (arrList.get(i) == arrList.get(i+1)) {
                arrList.remove(i+1);
            }
        }
        System.out.println(arrList);


    }
}