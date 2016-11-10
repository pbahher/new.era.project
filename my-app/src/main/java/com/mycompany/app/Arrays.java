package com.mycompany.app;

public class Arrays {

    /*public void findNull() {

    }*/

    public void findMaxArrays() {

        int[] numbers = {-9, 6, 0, 8};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i])
                max = numbers[i];
        }

        System.out.println(max);
    }
}
