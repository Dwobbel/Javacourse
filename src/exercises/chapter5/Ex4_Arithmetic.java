package exercises.chapter5;
import java.util.*;

/**
 * Created by KristofB on 4/10/2017.
 */
public class Ex4_Arithmetic {
    public static void main(String [] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef getal a in:");
        int a = keyboard.nextInt();
        System.out.println("Geef getal b in:");
        int b = keyboard.nextInt();

        System.out.println("Getal a = " + a);
        System.out.println("Getal b = " + b);

        int result = a + b;
        System.out.println("a + b = " + result);

        result = a - b;
        System.out.println("a - b = " + result);

        result = a * b;
        System.out.println("a * b = " + result);

        result = a / b;
        System.out.println("a / b = " + result);

        result = a % b;
        System.out.println("a % b = " + result);

        System.out.println("--a =" + --a);
        a = ++a;
        System.out.println("a-- =" + a--);
        a = ++a;
        System.out.println("++a =" + ++a);
        a = --a;
        System.out.println("a++ =" + a++);

        keyboard.close();
    }
}
