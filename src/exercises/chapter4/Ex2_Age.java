package exercises.chapter4;

import java.util.*;

/**
 * Created by KristofB on 27/09/2017.
 */
public class Ex2_Age {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter your age:");
        int age = keyboard.nextInt(); //Input

        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a child");
        }

        keyboard.close();

    }
}
