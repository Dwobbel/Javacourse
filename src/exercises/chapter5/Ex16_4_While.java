package exercises.chapter5;

/**
 * Created by KristofB on 15/10/2017.
 */
public class Ex16_4_While {
    public static void main(String[] args) {
        char letter = 'a';
        while (letter <= 'z')       {
            System.out.print(letter);
            letter++;
            if (letter <= 'z') {
                System.out.print(" - ");
            }
        }
    }
}
