package com.mycompany.app.interfaces.impl;

import com.mycompany.app.interfaces.Figures;
import com.sun.xml.internal.bind.v2.model.core.LeafInfo;

/**
 * Created by pbahher on 6/12/17.
 */
public class Parallelepiped implements Figures {

    int height, lenght, width;

    public Parallelepiped() {
    }

    public Parallelepiped(int height, int lenght, int width) {
        this.height = height;
        this.lenght = lenght;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double perimetr() {
        System.out.println("Class Parallelepiped: ");
        return (4 * height)+(4 * lenght)+(4 * width);
    }

    public double square() {
        System.out.println("Class Parallelepiped: ");
        return (height*lenght + lenght*width + width*height)*2;
    }

}
