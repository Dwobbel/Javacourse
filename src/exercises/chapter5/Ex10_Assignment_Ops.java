package exercises.chapter5;

/**
 * Created by KristofB on 4/10/2017.
 */
public class Ex10_Assignment_Ops {
    public static void main(String[] args) {
        int number1 = 57;
        int number2 = 33;
        System.out.println("number1 : \t" +number1);
        System.out.println("number2 : \t" +number2);
        System.out.println("number1 += number 2 \t -> \t number1: " +(number1 += number2));
        System.out.println("number1 -= number 2 \t -> \t number1: " +(number1 -= number2));
        System.out.println("number1 *= number 2 \t -> \t number1: " +(number1 *= number2));
        System.out.println("number1 /= number 2 \t -> \t number1: " +(number1 /= number2));
        System.out.println("number1 %= number 2 \t -> \t number1: " +(number1 %= number2));
        System.out.println("number1 &= number 2 \t -> \t number1: " +(number1 &= number2));
        System.out.println("number1 |= number 2 \t -> \t number1: " +(number1 |= number2));
        System.out.println("number1 ^= number 2 \t -> \t number1: " +(number1 ^= number2));
        System.out.println("number1 >>= number 2 \t -> \t number1: " +(number1 >>= number2));
        System.out.println("number1 <<= number 2 \t -> \t number1: " +(number1 <<= number2));
        System.out.println("number1 >>>= number 2 \t -> \t number1: " +(number1 >>>= number2));
    }
}
