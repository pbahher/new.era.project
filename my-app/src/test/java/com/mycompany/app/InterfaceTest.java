package com.mycompany.app;

import com.mycompany.app.interfaces.FigureWork;
import com.mycompany.app.interfaces.Figures;
import com.mycompany.app.interfaces.impl.Parallelepiped;
import com.mycompany.app.interfaces.impl.Square;
import com.mycompany.app.interfaces.impl.Triangle;
import org.junit.Test;

/**
 * Created by pbahher on 6/10/17.
 */
public class InterfaceTest {

    Parallelepiped parallelepiped = new Parallelepiped(4, 10, 6);
    Square square = new Square(7);
    Triangle triangle = new Triangle(6, 6, 12);

    @Test
    public void useInterfaceTest () {

        FigureWork figureWork = new FigureWork();

        figureWork.calculatePerimetr(parallelepiped);

        figureWork.calculateSquare(parallelepiped);

        figureWork.calculatePerimetr(square);

        figureWork.calculateSquare(square);

        figureWork.calculatePerimetr(triangle);

        figureWork.calculateSquare(triangle);

    }

    /*Circle circle = new Circle(15);
    Circle circle2 = new Circle(45);

    Circle emptyConstr = new Circle();

    Rectangl rectangl = new Rectangl(5, 10, 15);
    Rectangl rectangl2 = new Rectangl(11, 54, 77);

    String str;

    @Test
    public void useInterfaceTest () {
        FigureWork figureWork = new FigureWork();

        figureWork.calculatePerimetr(emptyConstr);

        rectangl.setA(100);

        figureWork.calculatePerimetr(rectangl);
    }*/

}
