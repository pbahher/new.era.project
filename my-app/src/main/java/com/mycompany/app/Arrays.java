package com.mycompany.app;

import com.mycompany.Utils;

@SuppressWarnings("Duplicates")
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
        int a[] = {1, 2, 3, 4, 5, 11, 20};
        int b[] = {1, 2, 7, 14, 20, 21, 70, 100500};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    b[j] = 0;
                }
            }
        }

        int size = a.length;
        for (int i : b) {
            if (i != 0) {
                size++;
            }
        }

        int c[] = new int[size];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }

        int index = a.length;
        for (int i = 0; i < b.length; i++) {

            if (b[i] != 0) {
                c[index] = b[i];
                index++;
            }
        }

        Utils.printIntMass(Utils.sortMass(c));
    }

    public void zadacha13() {
        int a[] = {1, 2, 3, 4, 5, 6, 70};
        int b[] = {1, 2, 7, 14, 6, 21, 70, 20};
        int c[];
        int size = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    size++;
                }
            }
        }

        c = new int[size];
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    c[index] = b[j];
                    index++;
                }
            }
        }

        Utils.printIntMass(Utils.sortMass(c));

    }

    public void zadacha14() {
        int a[] = {1, 2, 3, 4, 5, 6, 70, 100500};
        int b[] = {1, 2, 7, 14, 6, 21, 70, 20};
        int c[] = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j] && a[i] != 0 && b[i] != 0) {
                    a[i] = b[j] = 0;
                    break;
                }
            }
        }

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        int size = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != 0) {
                size++;
            }
        }

        int d[] = new int[size];
        size = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != 0) {
                d[size] = c[i];
                size++;
            }
        }

        Utils.printIntMass(Utils.sortMass(d));
    }


    public void zadacha15() {
        int index = 0;
        int value = 0;
        int a[] = new int[100];

        do {
            if (value % 13 == 0 && value % 17 == 0) {
                a[index] = value;
                index++;
            }

            value++;
        } while (index < 100);

        Utils.printIntMass(a);
    }

    public void zadacha16() {
        int[] a = {2, 5, 7, 5, 2, 7, 9, 11};
        int[] b = new int[8];

        for (int i = 0; i < a.length; i++) {
            if (i - 1 < 0) {  //проверка на то что это первый елемент
                if (a[i] > a[a.length - 1] && a[i] > a[i + 1]) {
                    b[i] = a[i];
                }
            }

            if (i + 1 >= a.length) { //проверка что это последний елемнет
                if (a[i] > a[i - 1] && a[i] > a[0]) {
                    b[i] = a[i];
                }
            }

            if (!(i - 1 < 0) && !(i + 1 >= a.length)) {  //всё что находится между первым и последним елементом
                if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                    b[i] = a[i];
                }
            }
        }

        int size = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                size++;
            }
        }

        int c[] = new int[size];
        int index = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                c[index] = b[i];
                index++;
            }
        }

        Utils.printIntMass(c);
    }

}
