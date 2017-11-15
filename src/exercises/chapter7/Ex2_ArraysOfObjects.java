package exercises.chapter7;

import java.util.*;

/**
 * Created by KristofB on 15/11/2017.
 */
public class Ex2_ArraysOfObjects {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef tekst in");
        String text = keyboard.nextLine();
        String[] words = text.split(" ");
        for(String n: words) {
            System.out.println(n);
        }
    }
}
