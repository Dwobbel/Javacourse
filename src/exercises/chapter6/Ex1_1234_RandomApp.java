package exercises.chapter6;
import java.util.*;
/**
 * Created by KristofB on 25/10/2017.
 */
public class Ex1_1234_RandomApp {
    public static void main(String[] args) {
        Random rand = new Random();
        int getal1 = rand.nextInt();
        int getal2 = rand.nextInt(100);
        System.out.println("Getal 1 = "+getal1);
        System.out.println("Getal 2 = "+getal2);

    }
}
