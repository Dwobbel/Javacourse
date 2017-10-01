package exercises.chapter4;

import java.util.*;

/**
 * Created by KristofB on 27/09/2017.
 */
public class Ex1_Sum {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a number:");
        int a = keyboard.nextInt(); //Input

        System.out.print("Enter another number:");
        int b = keyboard.nextInt(); //Input

        int sum = a +b;

        System.out.println("The sum is " +sum); //Output

    }
}
