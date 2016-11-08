package com.mycompany.app;


public class Variables {

    public void theNumberRemainder() {
        int q = 21;
        int w = 5;
        System.out.println((q/w)+" остаток "+(q%w));
    }

    public void sumOfNumbers() {
        int n = 22;
        int a = (n%10);
        int b = ((n/10)%10);
        System.out.println("сумма чисел n = "+(a+b));
    }

    public void roundingNumbers() {
        double a =22.3;
        System.out.println(Math.round(a));
    }

    public void roundingThreeNumbers() {
        int a = 345;
        int b = (a%10);
        int c = ((a/10)%10);
        int d = ((a/100)%10);
        System.out.println("сумма чисел a = "+(b+c+d));
    }

    public void calculateIncreasingSequence() {
        int a = 7;
        int b = 5;
        int c = 6;
        if (a<b&&a<c) {
            if (b<c)
                System.out.println(a+" "+b+" "+c);
            else
                System.out.println(a+" "+c+" "+b);
        }
            if (b<a&&b<c) {
            if (a<c)
                System.out.println(b+" "+a+" "+c);
            else
                System.out.println(b+" "+c+" "+a);
        }
            if (c<b&&c<a) {
            if (b<a)
                System.out.println(c+" "+b+" "+a);
            else
                System.out.println(c+" "+a+" "+b);
        }
    }

}
