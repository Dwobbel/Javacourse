package solutions.javabasics.chapter10.exercise10;

import exercises.chapter10.*;

/**
 * Created by KristofB on 24/01/2018.
 */
public class DrawingApp {
    public static void main(String[] args) {
        Drawing tekening = new Drawing();
        Square vierkant = new Square();
        tekening.add(vierkant);
        System.out.println(tekening.getSize());
        tekening.remove(vierkant);
        System.out.println(tekening.getSize());
        tekening.remove(null);
        System.out.println(tekening.getSize());
        Rectangle rechthoek = new Rectangle();
        tekening.remove(rechthoek);
        System.out.println(tekening.getSize());
        Circle cirkel = new Circle();
        Triangle driehoek = new Triangle();
        tekening.add(cirkel);
        tekening.add(driehoek);
        tekening.add(rechthoek);
        System.out.println(tekening.getSize());
        Rectangle rechthoek2 = new Rectangle();
        tekening.remove(rechthoek2);
        System.out.println(tekening.getSize());
    }
}
