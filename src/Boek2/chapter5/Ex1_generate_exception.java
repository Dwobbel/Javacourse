package Boek2.chapter5;

import java.util.Scanner;

/**
 * Created by KristofB on 7/03/2018.
 */
public class Ex1_generate_exception {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num = Integer.parseInt(keyboard.next());
        int den = Integer.parseInt(keyboard.next());
        int div = num / den;
        System.out.format("%d/%d=%d, num, den, div");
        keyboard.close();
    }
}
