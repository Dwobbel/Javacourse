package exercises.chapter8;

import static exercises.chapter8.Circle.*;
/**
 * Created by KristofB on 6/12/2017.
 */
public class CircleApp {
    public static void main(String[] args) {
        Circle rondje = new Circle(10);
        rondje.setX(10);
        rondje.setY(20);
        System.out.println("X= "+ rondje.getX());
        System.out.println("Y= "+rondje.getY());
        rondje.setPosition(50,50);
        System.out.println("X= "+rondje.getX());
        System.out.println("Y= "+rondje.getY());

        rondje.setRadius(10);
        System.out.println("De straal is " +rondje.getRadius());
        System.out.println("De oppervlakte is "+rondje.getArea());
        System.out.println("De omtrek is " +rondje.getPerimeter());
        rondje.grow(5);
        System.out.println("De straal is " +rondje.getRadius());
        System.out.println("De oppervlakte is " +rondje.getArea());
        System.out.println("De omtrek is "+rondje.getPerimeter());
        System.out.println("Het aantal cirkels is "+getCount());
    }
}
