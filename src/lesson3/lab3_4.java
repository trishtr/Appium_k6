package lesson3;

public class lab3_4 {

    public static void main(String[] args) {

        int[] arr1 = {1, 12, 16, 28, 34};
        int[] arr2 = {1, 13, 16, 27, 99};

        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr3[k++] = arr1[i++];
            } else {
                arr3[k++] = arr2[j++];
            }
        }
            while (i < arr1.length) {
                arr3[k++] = arr1[i++];
            }
            while (j < arr2.length) {
                arr3[k++] = arr2[j++];
            }
            for (int m = 0; m < arr1.length + arr2.length; m++) {
                System.out.print(arr3[m] + " ");
            }
        }
    }


