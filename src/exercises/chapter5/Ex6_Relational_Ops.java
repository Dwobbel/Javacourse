package exercises.chapter5;

import java.util.Scanner;

/**
 * Created by KristofB on 4/10/2017.
 */
public class Ex6_Relational_Ops {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef getal a in:");
        int a = keyboard.nextInt();
        System.out.println("Geef getal b in:");
        int b = keyboard.nextInt();

        System.out.println("Getal a = " + a);
        System.out.println("Getal b = " + b);

        boolean result = a < b;
        System.out.println ("a < b \t :\t" + result);
        result = a <= b;
        System.out.println ("a <= b \t :\t" + result);
        result = a > b;
        System.out.println ("a > b \t :\t" + result);
        result = a >= b;
        System.out.println ("a >= b \t :\t" + result);
        result = a == b;
        System.out.println ("a == b \t :\t" + result);
        result = a != b;
        System.out.println ("a != b \t :\t" + result);
    }
}
