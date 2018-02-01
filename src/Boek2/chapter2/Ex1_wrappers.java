package Boek2.chapter2;

import java.util.Scanner;

import static java.lang.Integer.parseInt;


/**
 * Created by KristofB on 31/01/2018.
 */
public class Ex1_wrappers {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.next();

        Integer meuh = parseInt(input);
        meuh = meuh + 5;

        System.out.println(meuh);

    }
}
