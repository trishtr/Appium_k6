package lesson3;

public class lab3_1 {

    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 5};
        int evenc = 0;
        int oddc = 0;
        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] % 2 != 0) {
                oddc++;
            } else {
                evenc++;}

        }
        System.out.println("Odd numbers : " + oddc);
        System.out.println("Even numbers : " + evenc);

    }
}