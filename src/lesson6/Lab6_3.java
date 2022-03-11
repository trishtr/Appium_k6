package lesson6;

public class Lab6_3 {

    public static void main(String [] args){
        String myStr = "1253648abcjndj756905";
        char[] arr = myStr.toCharArray();

        for (Character single_char: arr){
            if(Character.isDigit(single_char))
            {
                System.out.print(single_char);
            }
            else
            {
                myStr.replace(single_char.toString(), "");
            }
        }

    }
}
