package com.mycompany.app;

public class Variables2 {

    public void task1() {
        for (int i = 1; i <= 99; i=i+2) {
            System.out.print(i+" ");
        }
        System.out.print("\n");
    }

    public void task2() {
        int a = 1;
        while (a <= 99) {
            System.out.print(a+" ");
            a=a+2;
        }
    }

    public void task3() {
        int n =1;
        for (int a=1; a<=9; a=a+1) {
            n=n*a;
        }
        System.out.println("\n"+n);
    }

    public void task4() {
        int n=0;
        int a=1;
        while (n<=9) {
            n=n+1;
            a=a*n;
        }
        System.out.print(n);
    }

    public void task5() {
        double x = 2;
        int n = 10;
        double c = 1;
        for (int i = 1; i <= n; i++) {
            c= c * x;
        }
            System.out.println("\n"+(int)c);
    }

    public void task6() {
        for (int a=0, i=1; i<=10; a=a-5, i++) {
            System.out.print(a+" ");
        }
        System.out.print("\n");
    }

    public void task7() {
        for (int a=0, i=1; i<=10; a=a-5, i++) {
            if (i==4) {
                break;
            }
            System.out.print(a+" ");
        }
    }
}
