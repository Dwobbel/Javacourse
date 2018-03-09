package Boek2.chapter5;

import java.util.Scanner;

/**
 * Created by KristofB on 7/03/2018.
 */
public class Ex4_gemeenschappelijke_exception2 {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(System.in);
            int num = Integer.parseInt(keyboard.next());
            int den = Integer.parseInt(keyboard.next());
            int div = num / den;
            System.out.format("%d/%d=%d, num, den, div");
            keyboard.close();
        } catch (NumberFormatException | ArithmeticException ex) {
            System.out.println("invalid input");
        }
        System.out.println("the end");
    }
}
