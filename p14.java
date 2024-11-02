/*Write a program in Java to accept the following city name as argument
in the command line and sort them in alphabetic order. city names are
(Kolkata, Chennai, Mumbai, Delhi, Bangalore, Ahmadabad).*/

import java.util.*;
public class p14 {
    public static void main(String[] city) {
        int i, j;
        String temp;
        for (i = 0; i < city.length; i++) {
            for (j = i + 1; j < city.length; j++) {
                if (city[i].compareTo(city[j]) > 0) {
                    temp = city[i];
                    city[i] = city[j];
                    city[j] = temp;
                }
            }
        }
        System.out.print("Sorted cities are: ");
        for (i = 0; i < city.length; i++)
            System.out.print(city[i] + " ");
    }
}