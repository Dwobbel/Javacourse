package Boek2.chapter2;

import java.time.LocalDate;

/**
 * Created by KristofB on 7/02/2018.
 */
public class Ex3_LocalDate {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1983,6,21);

        System.out.println("x-ste dag van het jaar: " +birthday.getDayOfYear());
        System.out.println("x-ste dag van de maand: " +birthday.getDayOfMonth());
        System.out.println("Je bent geboren op een " +birthday.getDayOfWeek());
        System.out.println("Geboren in een schrikkeljaar? " + birthday.isLeapYear());
    }
}
