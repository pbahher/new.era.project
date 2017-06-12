package com.mycompany.app.interfaces.impl;

import com.mycompany.app.interfaces.Figures;

/**
 * Created by pbahher on 6/12/17.
 */
public class Square implements Figures {

    int side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double perimetr() {
        System.out.println("Class Square: ");
        return 4 * side;
    }

    public double square() {
        System.out.println("Class Square: ");
        return side * side;
    }

}
