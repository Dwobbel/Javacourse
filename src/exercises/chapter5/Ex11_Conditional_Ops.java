package exercises.chapter5;

/**
 * Created by KristofB on 11/10/2017.
 */
public class Ex11_Conditional_Ops {
    public static void main(String[] args) {
        int number1 = 57;
        int number2 = 33;
        int number3 = -65;

        System.out.println("number1 : \t" +number1);
        System.out.println("number2 : \t" +number2);
        System.out.println("number3 : \t" +number3);
        System.out.println("(number1 < number2)?number1:number2 \t->\t" + ((number1 < number2)?number1:number2));
        System.out.println("(number1 < number3)?number1:number3 \t->\t" + ((number1 < number3)?number1:number3));
        System.out.println("(number2 < number1)?number2:number1 \t->\t" + ((number2 < number1)?number2:number1));
        System.out.println("(number2 < number3)?number2:number3 \t->\t" + ((number3 < number3)?number2:number3));
        System.out.println("(number3 < number1)?number3:number1 \t->\t" + ((number3 < number1)?number3:number1));
        System.out.println("(number3 < number2)?number3:number2 \t->\t" + ((number3 < number2)?number3:number2));



    }
}
