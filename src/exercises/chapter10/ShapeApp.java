package exercises.chapter10;

import exercises.chapter10.Shape;
import exercises.chapter8.Rectangle;

import org.w3c.dom.css.Rect;

public class ShapeApp {
    public static void main(String[] args) {
        Square vierkant = new Square();
        Rectangle rechthoek = new Rectangle();
        Triangle driehoek = new Triangle();
        IsoScelestriangle wtf = new IsoScelestriangle();

        System.out.println(Square.getCount());
        System.out.println(Rectangle.getCount());
        System.out.println(Triangle.getCount());
        System.out.println(IsoScelestriangle.getCount());
        vierkant.setSide(5);
        System.out.println(vierkant.getSide());
        driehoek.setW(10);
        System.out.println(driehoek.getW());

    }
}
