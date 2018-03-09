package exercises.chapter10;

import exercises.chapter10.Shape;
import exercises.chapter8.Rectangle;


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

        System.out.println(vierkant.toString());
        System.out.println(rechthoek.toString());
        System.out.println(driehoek.toString());
        System.out.println(wtf.toString());

        vierkant.setX(10);
        vierkant.setY(10);
        System.out.println(vierkant.hashCode());

        Rectangle rechthoek2 = new Rectangle(5, 5, 10,10);
        System.out.println(rechthoek2.hashCode());
        System.out.println(vierkant.equals(rechthoek2));

        Square vierkant2 = new Square(5,10,10);

        System.out.println(vierkant.equals(vierkant2));



    }
}
