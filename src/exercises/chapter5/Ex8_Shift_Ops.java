package exercises.chapter5;

/**
 * Created by KristofB on 4/10/2017.
 */
public class Ex8_Shift_Ops {
    public static void main(String[] args) {
        int number1 = 1;
        int number2 = 1;
        int number3 = -5;

        int result = number3 << number2;
        System.out.println ("number3 << number2 \t\t :\t" + result);
        result = number1 << number2;
        System.out.println ("number1 << number2 \t\t :\t" + result);
        result = number1 >>> number2;
        System.out.println ("number1 >>> number2 \t :\t" + result);
        result = number3 >>> number2;
        System.out.println ("number3 >>> number2 \t :\t" + result);
        result = number1 >> number3;
        System.out.println ("number1 >> number2 \t\t :\t" + result);

    }
}
