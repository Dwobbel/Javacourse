package exercises.chapter5;

/**
 * Created by KristofB on 11/10/2017.
 */
public class Ex12_PriorityRules {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int result = ++a *b-- + b < 2 ? --a : ++b;
        System.out.println(result);
    }
}
