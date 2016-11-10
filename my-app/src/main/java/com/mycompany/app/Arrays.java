package com.mycompany.app;

public class Arrays {

    public void findNull() {

        int[] a = {2, 3, 0, 4, 0, 3, 0, 0};
        int z = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == z) {

                System.out.print(a[i] + " ");
            }
        }

    }

    public void findMaxArrays() {

        int[] numbers = {-9, 6, 0, 8};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i])
                max = numbers[i];
        }

        System.out.println(max);
    }

    public void lineSearch() {

        int[] a = {2, 7, 1, 3, 0, 3, 0, 0};
        int z = 3;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == z) {

                System.out.println("\n" + i);
                break;
            }
        }
    }

    public void maxElements() {

        int[] a = {2, 5, 7, 2, 4, 3, 7};
        int max = a[0];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (max < a[i])
                max = a[i];


        }

        System.out.print(max);
    }

}
