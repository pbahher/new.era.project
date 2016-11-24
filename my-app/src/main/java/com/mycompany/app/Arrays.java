package com.mycompany.app;

import com.mycompany.Utils;

public class Arrays {

    public void zadacha01() {

        int[] a = {2, 3, 0, 4, 0, 3, 0, 0};
        int z = 0;
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == z) {
                count++;
                System.out.print("Element number which has zero value = " + i + "\n");
            }
        }

        System.out.println("Summ = " + count);
    }

    public void zadacha02() {
        int[] numbers = {-9, 6, 0, 8};
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i])
                max = numbers[i];
        }

        System.out.println(max);
    }

    public void zadacha03() {

        int[] a = {2, 7, 1, 3, 0, 3, 0, 0};
        int z = 3;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == z) {
                System.out.println("\n" + i);
                break;
            }
        }
    }

    public void zadacha04() {

        int[] a = {2, 5, 7, 2, 4, 3, 7};
        int max = a[0];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (max == a[i]) {
                count++;
            }
        }
        System.out.print(count);

    }

    public void zadacha05() {
        int[] a = {2, 5, 7, 2, 4, 3, 7};

        for (int i = a.length - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
    }

    public void zadacha06() {
        int[] a = {2, 5, 6, 1, 4, 3, 7};

        for (int i = 0; i < a.length; i++) {
            int min = a[i];
            int min_i = i;

            for (int j = i + 1; j < a.length; j++) {

                if (a[j] < min) {
                    min = a[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = a[i];
                a[i] = a[min_i];
                a[min_i] = tmp;
            }
        }

        String stringAsArray = "";

        for (int i : a) {
            stringAsArray = stringAsArray + i + " ";
        }

        System.out.println(stringAsArray);
    }

    public void zadacha07() {
        int[] a = {2, 3, 4, 3, 2};

        for (int i = 0; i < a.length; i++) {
            int y = a.length - i - 1;
            if (a[i] != a[y]) {
                System.out.println("Not polindrom.");
                break;
            }
            y--;

        }

        System.out.println("Polindrom.");
    }

    public void zadacha09() {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int positions = 2;

        for (int i = 0; i < positions; i++) {
            int temp = array[array.length - 1];

            for (int j = array.length - 1; j > 0; j--) {
                array[j] = array[j - 1];
            }

            array[0] = temp;
        }

        String stringAsArray = "";

        for (int i : array) {
            stringAsArray = stringAsArray + i + " ";
        }

        System.out.println(stringAsArray);
    }

    public void zadacha08() {
        int[] a = {2, 3, 4, 5, 6};
        int temp = a[a.length - 1];

        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }

        a[0] = temp;

        String stringAsArray = "";

        for (int i : a) {
            stringAsArray = stringAsArray + i + " ";
        }

        System.out.println(stringAsArray);
    }


    public void zadacha10() {
        double[] a = {2, 5, 7, 5, 2};
        double[] b = new double[5];

        for (int i = 0; i < a.length; i++) {
            if (i - 1 < 0) {
                b[i] = (a[i + 1] + a[a.length - 1]) / 2;
            }

            if (i + 1 >= a.length) {
                b[i] = (a[i - 1] + a[0]) / 2;
            }

            if (!(i - 1 < 0) && !(i + 1 >= a.length)) {
                b[i] = (a[i - 1] + a[i + 1]) / 2;
            }
        }

        Utils.printDoubleMass(b);
    }

    public void zadacha11() {
        int a[] = {9, 1, 2, 3, 4, 5, 6, 7};
        int b[] = {9, 1, 2, 3, 4, 5, 6, 7};

        double c[] = new double[8];

        for (int i = 0; i < c.length; i++) {
            c[i] = a[i] / b[i];
        }

        Utils.printDoubleMass(c);

    }

    public void zadacha12() {

    }

    public void zadacha13() {

    }

    public void zadacha14() {

    }

    public void zadacha15() {

    }

    public void zadacha16() {

    }

}
