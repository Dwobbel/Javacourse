package exercises.chapter5;

/**
 * Created by KristofB on 4/10/2017.
 */
public class DataTypesApp {
    public static void main(String[] args) {
        boolean aBoolean = false;
        char aCharacter = 'd';
        byte aByte = 126;
        short aShortInteger = 1568;
        int anInteger = 1256456;
        long aLongInteger = 45631341L;
        float aDecimalNumber = 1256.32F;
        double aBigDecimalNumber = 12.365987451236;

        System.out.println(aBoolean);
        System.out.println(aCharacter);
        System.out.println(aByte);
        System.out.println(aShortInteger);
        System.out.println(anInteger);
        System.out.println(aLongInteger);
        System.out.println(aDecimalNumber);
        System.out.println(aBigDecimalNumber);

        System.out.println("\nExtra oef:");
        System.out.println("----------");

        int octalint = 0342;
        int hexint = 0x56_31;
        int binint = 0b1001_1100;

        System.out.println(octalint);
        System.out.println(hexint);
        System.out.println(binint);







    }
}
