package exercises.chapter5;

/**
 * Created by KristofB on 11/10/2017.
 */
public class Ex13_Scope_Variable {
    public static void main(String[] args) {

        {
            int getal = 100;
        }
        {
            int getal = 10;

            System.out.println(getal);
        }
    }
}
