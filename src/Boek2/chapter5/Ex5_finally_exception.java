package Boek2.chapter5;

import java.util.Scanner;

/**
 * Created by KristofB on 7/03/2018.
 */
public class Ex5_finally_exception {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format("%d/%d=%d, num, den, div");
            keyboard.close();
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("invalid input");
        } finally {
            keyboard.close();
            System.out.println("the end");
        }
    }
}
