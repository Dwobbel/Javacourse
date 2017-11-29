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

        rect.width = 10;
        rect.height = 5;
        rect.x = 200;
        rect.y = 200;

        rect2.width = 20;
        rect2.height = 10;
        rect2.x = 400;
        rect2.y = 400;

        System.out.println("De breedte van de rechthoek is " + rect.width);
        System.out.println("De hoogte van de rechthoek is " + rect.height);
        System.out.println("De x-coördinaat is " + rect.x);
        System.out.println("De y-coördinaat is " + rect.y);

        System.out.println("De breedte van de rechthoek is " + rect2.width);
        System.out.println("De hoogte van de rechthoek is " + rect2.height);
        System.out.println("De x-coördinaat is " + rect2.x);
        System.out.println("De y-coördinaat is " + rect2.y);

        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
        
    }
}
