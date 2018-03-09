package Boek2.chapter5;

import java.util.Scanner;

/**
 * Created by KristofB on 7/03/2018.
 */
public class Ex3_multiple_exception {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format("%d/%d=%d, num, den, div");
            keyboard.close();
        } catch (NumberFormatException nfe) {
            System.out.println("geef een geldig nummer in");
            System.out.println(nfe.getMessage());
            nfe.printStackTrace();
        } catch (ArithmeticException ae) {
            System.out.println("wie deelt door nul is een snul");
        }
        System.out.println("the end");
    }
}
