package com.mycompany.app.interfaces.impl;

import com.mycompany.app.interfaces.Figures;

/**
 * Created by pbahher on 6/12/17.
 */
public class Triangle implements Figures {

    int catheter1, catheter2, hypotenuse;

    public Triangle() {
    }

    public Triangle(int catheter1, int catheter2, int hypotenuse) {
        this.catheter1 = catheter1;
        this.catheter2 = catheter2;
        this.hypotenuse = hypotenuse;
    }

    public int getCatheter1() {
        return catheter1;
    }

    public void setCatheter1(int catheter1) {
        this.catheter1 = catheter1;
    }

    public int getCatheter2() {
        return catheter2;
    }

    public void setCatheter2(int catheter2) {
        this.catheter2 = catheter2;
    }

    public int getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(int hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double perimetr() {
        System.out.println("Class Triangle: ");
        return catheter1 + catheter2 + hypotenuse;
    }

    public double square() {
        System.out.println("Class Triangle: ");
        return (catheter1 * catheter2)/2;
    }
}
