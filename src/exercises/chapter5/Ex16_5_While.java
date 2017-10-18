package exercises.chapter5;

import java.util.Scanner;

/**
 * Created by KristofB on 18/10/2017.
 */
public class Ex16_5_While {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef een getal in:");
        int getal = keyboard.nextInt();

        while (getal < 0 || getal > 10) {
            System.out.println("Foute input, geef opnieuw een getal in:");
            getal = keyboard.nextInt();
            }
        System.out.println("Correcte input");
    }
}
