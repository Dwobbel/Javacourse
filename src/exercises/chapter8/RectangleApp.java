package exercises.chapter8;

import org.w3c.dom.css.Rect;

/**
 * Created by KristofB on 22/11/2017.
 */
public class RectangleApp {
    public static void main(String[] args) {
        System.out.println("This program uses a rectangle");

        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle();

        rect.setWidth(10);
        rect.setHeight(20);
        rect.setX(100);
        rect.setY(200);

        rect2.setWidth(10);
        rect2.setHeight(20);
        rect2.setX(100);
        rect2.setY(200);

        System.out.println("De breedte van de rechthoek is " + rect.getWidth());
        System.out.println("De hoogte van de rechthoek is " + rect.getHeight());
        System.out.println("De x-coördinaat is " + rect.getX());
        System.out.println("De y-coördinaat is " + rect.getY());

        System.out.println("De breedte van de rechthoek is " + rect2.getWidth());
        System.out.println("De hoogte van de rechthoek is " + rect2.getHeight());
        System.out.println("De x-coördinaat is " + rect2.getX());
        System.out.println("De y-coördinaat is " + rect2.getY());


        System.out.println("-----");
        System.out.println("De oppervlakte is: " + rect.getArea());
        System.out.println("De omtrek is: " + rect.getPerimeter());
        System.out.println("De breedte van de rechthoek is " + rect.getWidth());
        System.out.println("De hoogte van de rechthoek is " + rect.getHeight());
        System.out.println("De x-coördinaat is " + rect.getX());
        System.out.println("De y-coördinaat is " + rect.getY());
        rect.grow(10);
        System.out.println("-----");
        System.out.println("De oppervlakte is: " + rect.getArea());
        System.out.println("De omtrek is: " + rect.getPerimeter());
        System.out.println("De breedte van de rechthoek is " + rect.getWidth());
        System.out.println("De hoogte van de rechthoek is " + rect.getHeight());
        System.out.println("De x-coördinaat is " + rect.getX());
        System.out.println("De y-coördinaat is " + rect.getY());
        System.out.println("-----");
        rect2.setWidth(-10);
        rect2.setHeight(-20);
        System.out.println("De breedte van de rechthoek is " + rect2.getWidth());
        System.out.println("De hoogte van de rechthoek is " + rect2.getHeight());
        System.out.println("-----");
        rect.setWidth(-10);
        rect.setHeight(-20);
        rect.grow(-5);
        System.out.println("De breedte van de rechthoek is " + rect.getWidth());
        System.out.println("De hoogte van de rechthoek is " + rect.getHeight());

        Rectangle rechthoek = new Rectangle(10,20);
        System.out.println("de breedte van de rechthoek is "+rechthoek.getWidth());
        System.out.println("de hoogte van de rechthoek is "+rechthoek.getHeight());

        Rectangle rechthoek2 = new Rectangle(20, 30, 100, 100);
        System.out.println("de breedte van de rechthoek is "+rechthoek2.getWidth());
        System.out.println("de hoogte van de rechthoek is "+rechthoek2.getHeight());
        System.out.println("de x-coördinaat is "+rechthoek2.getX());
        System.out.println("de y-coördinaat is "+rechthoek2.getY());

        Rectangle rechthoek3 = new Rectangle(rechthoek2);
        System.out.println("de breedte van de rechthoek is "+rechthoek3.getWidth());
        System.out.println("de hoogte van de rechthoek is "+rechthoek3.getHeight());
        System.out.println("de x-coördinaat is "+rechthoek3.getX());
        System.out.println("de y-coördinaat is "+rechthoek3.getY());
        System.out.println("deze rechthoek heeft " + rechthoek3.ANGLES + " hoeken");

        System.out.println("aantal rechthoeken in dit programma: " + rect.count);

    }
}
