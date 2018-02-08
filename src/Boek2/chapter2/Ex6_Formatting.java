package Boek2.chapter2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * Created by KristofB on 7/02/2018.
 */
public class Ex6_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter myformatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Geef een datum in in het formaat DD/MM/YYYY");
        String input = keyboard.next();

        LocalDate datum = LocalDate.parse(input, myformatter );

        System.out.println(myformatter.format(datum));

        System.out.format("%1$tY/%1$tm/%1$td", datum);

    }
}
