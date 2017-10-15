package exercises.chapter5;

/**
 * Created by KristofB on 15/10/2017.
 */
public class Ex16_3_While {
    public static void main(String[] args) {
        int i = 5;
        while (i < 10000) {
            System.out.print(i);
            i = i * 5;
            if (i < 10000) {
                System.out.print(" - ");
            }
        }

    }
}
