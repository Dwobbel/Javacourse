package exercises.chapter5;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by KristofB on 15/10/2017.
 */
public class Ex16_buh_While {
    public static void main(String[] args) {
        Random rand = new Random();
        int getal = rand.nextInt(9) +1;
        int gok = 20;
        Scanner keyboard = new Scanner(System.in);
        System.out.println(getal);
        while (gok != getal) {
            System.out.println("Geef een getal in:");
            gok = keyboard.nextInt();
        }
        System.out.println("Proficiat!");
    }
}
