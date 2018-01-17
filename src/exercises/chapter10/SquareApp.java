package exercises.chapter10;

import exercises.chapter8.Rectangle;

/**
 * Created by KristofB on 17/01/2018.
 */
public class SquareApp {
    public static void main(String[] args) {
        Square vierkant = new Square();
        vierkant.setHeight(40);
        vierkant.setWidth(40);

        System.out.println("De oppervlakte is: " + vierkant.getArea());
        System.out.println("De omtrek is: " + vierkant.getPerimeter());
        System.out.println("De breedte van het vierkant is " + vierkant.getWidth());
        System.out.println("De hoogte van het vierkant is " + vierkant.getHeight());
        System.out.println("-----");

        System.out.println(vierkant.getSide());
        vierkant.setSide(50);
        System.out.println(vierkant.getSide());
        System.out.println("De oppervlakte is: " + vierkant.getArea());
        System.out.println("De omtrek is: " + vierkant.getPerimeter());

        Square test = new Square(30, 40,40);
        System.out.println(test.getSide());
        System.out.println("De oppervlakte is: " + test.getArea());
        System.out.println("De omtrek is: " + test.getPerimeter());

        Square meuh = new Square(test);
        System.out.println(test.getSide());
        System.out.println("De oppervlakte is: " + meuh.getArea());
        System.out.println("De omtrek is: " + meuh.getPerimeter());
        meuh.setSide(100);
        System.out.println("De oppervlakte is: " + meuh.getArea());
        System.out.println("De omtrek is: " + meuh.getPerimeter());

        System.out.println("-----");
        System.out.println("aantal vierkanten: " + meuh.getCount());
        Rectangle rechthoek1 = new Rectangle();
        System.out.println("aantal rechthoeken: " + rechthoek1.getCount());
        System.out.println("aantal vierkanten: " + meuh.getCount());

    }
}
