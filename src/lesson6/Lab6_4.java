package lesson6;

import java.sql.SQLOutput;

public class Lab6_4 {

    public static void main(String[] args) {

        String url = "https://google.com";
        String[] url_Split = url.split(":");
        String protocol = url_Split[0];
        String domain = url_Split[1].split("[.]")[1];
        System.out.println(protocol);
        System.out.println("." + domain);




    }
}
