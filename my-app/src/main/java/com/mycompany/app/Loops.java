package com.mycompany.app;

public class Loops {

    public void outputtOddNumbers() {
        for (int i = 1; i <= 99; i = i + 2) {
            System.out.print(i + " ");
        }
            System.out.println();
    }

    public void outputtNumbers() {
        int a = 1;

        while (a <= 99) {

            System.out.print(a + " ");
            a = a + 2;
        }
    }

    public void countingFactorial() {
        int n = 1;

        for (int a = 1; a <= 9; a = a + 1) {
            n = n * a;
        }

        System.out.println(n);
    }

    public void countingFactorialNewMethod() {
        int factorial = 1;
        int input = 9;

        while (input > 0) {
            factorial = factorial * input;
            input--;
        }

        System.out.print(factorial);
    }

    public void calculateTheDegree() {
        double x = 2;
        int n = 10;
        double c = 1;

        for (int i = 1; i <= n; i++) {
            c = c * x;
        }

        System.out.println("\n" + (int) c);
    }

    public void calculateOfSequence() {
        for (int a = 0, i = 1; i <= 10; a = a - 5, i++) {
            System.out.print(a + " ");
        }
    }

    public void calculateOfSequenceNewMethod() {
        for (int a = 0, i = 1; i <= 10; a = a - 5, i++) {
            if (i == 4) {
                break;
            }

            System.out.print(a + " ");
        }

            System.out.println("\n");
    }
}
