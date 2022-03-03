package lesson5;

import java.sql.SQLOutput;
import java.util.*;

public class Lab5 {

    public static void main (String [] args){

        Map<Integer, String> stuLst = new HashMap<>();
        stuLst.put(101, "Steve");
        stuLst.put(102, "Marry");
        stuLst.put(103, "Mark");
        stuLst.put(104, "Harry");
        stuLst.put(105, "Nancy");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pls Enter Student ID: ");
        Integer sid = scanner.nextInt();
        String sname = null;

        Iterator<Map.Entry<Integer, String>> it = stuLst.entrySet().iterator();
        while(it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            Set<Integer> allKeys = stuLst.keySet();
            for (Integer key : allKeys) {
                if (key == sid) {
                    sname = stuLst.get(key);
                }
                else {
                    sname = "Student's name is not in the list";
                }
            }
        }
        System.out.println("Student name : " + sname);
    }
}
