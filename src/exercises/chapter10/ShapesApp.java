package exercises.chapter10;

import exercises.chapter8.Circle;
import exercises.chapter8.Rectangle;

/**
 * Created by KristofB on 24/01/2018.
 */
public class ShapesApp {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Square(10);
        shapes[1] = new Rectangle(10, 10);
        shapes[2] = new Triangle(5, 5, 5, 10, 20);
        shapes[3] = new Rectangle(10,10);
        shapes[4] = new Square(10,5,3);
        shapes[5] = new Circle(20, 5, 5);
        shapes[6] = new Rectangle(10, 10);
        shapes[7] = new Rectangle(10, 10);
        shapes[8] = new Rectangle(10, 10);
        shapes[9] = new Rectangle(10, 10);
        for (Shape shape: shapes) {
            printShape(shape);
        }
    }

    private static void printShape(Shape shape) {
        System.out.println(" Area " + shape.getArea());
        System.out.println(" Perimeter " + shape.getPerimeter());
        System.out.println(" Position " + shape.getX() + " en " + shape.getY());

        if( shape instanceof Rectangle ) {
            Rectangle rechthoek = (Rectangle) shape;
            System.out.println("hoogte" + rechthoek.getHeight() + " breedte" + rechthoek.getWidth());
        }

        else if (shape instanceof Circle) {
            Circle cirkel = (Circle) shape;
            System.out.println("de rest komt nog");
        }
    }
}

