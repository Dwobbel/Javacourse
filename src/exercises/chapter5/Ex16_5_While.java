package exercises.chapter5;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by KristofB on 15/10/2017.
 */
public class Ex16_5_While {
    public static void main(String[] args) {
        Random rand = new Random();
        int getal = rand.nextInt(10);
        int gok = 20;
        //System.out.println(getal);
        while (gok != getal) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef een Getal in:");
        gok = keyboard.nextInt();
        }
        System.out.println("Proficiat!");
    }
}
