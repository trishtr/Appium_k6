package lesson8;

import java.util.ArrayList;
import java.util.List;

public class Salary extends Employee{


    public static void main(String[] args){
        Employee FT1 = new FullTime();
        Employee FT2 = new FullTime();
        Employee FT3 = new FullTime();
        Employee con1 = new Contractor();
        Employee con2 = new Contractor();
        List<Employee> empLst = new ArrayList<Employee>();
        empLst.add(FT1);
        empLst.add(FT2);
        empLst.add(FT3);
        empLst.add(con1);
        empLst.add(con2);
        int totalSal = 0;
        for (Employee emp: empLst) {
            totalSal += emp.getSal();
        }
        System.out.println(totalSal);
    }
}
