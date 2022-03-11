package lesson6;

public class Lab6_1 {

    public static void main(String[] args)
    {
        String input = "2hrs and 5 minutes";

        String[] inputbreak = input.split("and");

        String hrs = inputbreak[0].replaceAll("[^0-9]", "");
        int hrs_num = Integer.parseInt(hrs);
        String mns = inputbreak[1].replaceAll("[^0-9]", "");
        int mns_num = Integer.parseInt(mns);

        int mns_total = hrs_num*60 + mns_num;
        System.out.println(mns_total);


    }
}
