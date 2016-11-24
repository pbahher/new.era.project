package com.mycompany;

/**
 * Created by pbahher on 23.11.16.
 */
public class Utils {

    public static void printDoubleMass (double[] a) {
        String result = "";

        for (Object o : a) {
            result = result + o + ", ";
        }

        System.out.println(result);
    }

}
