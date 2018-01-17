package exercises.chapter10;

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

    }
}
