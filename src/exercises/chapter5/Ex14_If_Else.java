package exercises.chapter5;

import java.util.Scanner;

/**
 * Created by KristofB on 11/10/2017.
 */
public class Ex14_If_Else {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef gewicht in:");
        int w = keyboard.nextInt();
        System.out.println("Geef lengte in:");
        float h = keyboard.nextFloat();

        double bmi = w / (h * h);
        //System.out.println("bmi="+bmi);
        if (bmi < 20) {
            System.out.println("ondergewicht.");
        } else if (bmi < 25) {
            System.out.println("ok");
        } else if (bmi < 30) {
            System.out.println("overgewicht");
        } else if (bmi < 40) {
            System.out.println("obesitas");
        } else {
            System.out.println("ziekelijk overgewicht");
        }

    }
}