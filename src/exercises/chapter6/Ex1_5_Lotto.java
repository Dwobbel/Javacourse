package exercises.chapter6;
import java.util.*;
/**
 * Created by KristofB on 25/10/2017.
 */
public class Ex1_5_Lotto {
    public static void main(String[] args) {
        long seed = System.currentTimeMillis();
        Random rand = new Random(seed);
        int i = 1;
        while (i <= 6 ) {
            int getal = rand.nextInt(45);
            getal++; //= getal + 1;
            System.out.println("Getal " +i+" is "+getal);
            i++;
        }
    }
}
