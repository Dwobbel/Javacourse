package Boek2.chapter2;

import java.time.*;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Created by KristofB on 31/01/2018.
 */
public class Ex2_Weekdays {
    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef een dag van de week in (1-7): ");
        String input = keyboard.next();

        int dag = parseInt(input);

        DayOfWeek dagvandeweek = DayOfWeek.of(dag);


    }

}
