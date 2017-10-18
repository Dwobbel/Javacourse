package exercises.chapter5;

/**
 * Created by KristofB on 18/10/2017.
 */
public class Ex17_7_For {
    public static void main(String[] args) {

        for (int i=0; i<=10000 ; i++) {
            if (i%6==0 && i%28==0) {
                System.out.println(i);
            }
        }
    }
}
