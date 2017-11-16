package exercises.chapter6;

/**
 * Created by KristofB on 15/11/2017.
 */
public class Ex5_Formatter {
    public static void main(String[] args) {
        for (float i=1; i<=20; i = i+0.5f) {
            //System.out.printf("%-5.2f %s %.2f %s %n", i, " meter is", i*3.28, "feet");
            double feet = i *3.28;
            System.out.printf("%-5.2f meter is %-5.2f feet %n", i, feet);
        }

    }
}
