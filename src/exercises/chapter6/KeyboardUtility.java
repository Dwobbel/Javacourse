package exercises.chapter6;

import java.util.Scanner;

/**
 * Created by KristofB on 25/10/2017.
 */
public class KeyboardUtility {
    public static String readStr(){
        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine();
        return input;
    }
}
