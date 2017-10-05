package exercises.chapter5;

/**
 * Created by KristofB on 4/10/2017.
 */
public class Ex7_Logical_Ops {
    public static void main(String [] args){
        boolean a = true;
        boolean b = false;

        System.out.println("a \t\t:\t" + a);
        System.out.println("b \t\t:\t" + b);
        boolean result = true;
        result = a && b;
        System.out.println("a && b \t:\t" + result);
        result = a || b;
        System.out.println("a || b \t:\t" + result);
        result = !a;
        System.out.println("!a \t\t:\t" + result);
        result = !b;
        System.out.println("!b \t\t:\t" + result);
    }
}
