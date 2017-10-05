package exercises.chapter5;

/**
 * Created by KristofB on 4/10/2017.
 */
public class Ex5_Datatype_Casting {
    public static void main(String [] args) {
        byte a = 2;
        byte b = 3;
        int c = (int)a * b;
        System.out.println(c);

        int intA = 2147483645;
        int intB = 2147483642;
        long intC = (long) intA * intB;

        System.out.println(intC);
    }
}
