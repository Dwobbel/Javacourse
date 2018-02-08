package Boek2.chapter2;


import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 * Created by KristofB on 7/02/2018.
 */
public class Ex5_duration {
    public static void main(String[] args) {
        LocalDate geboorte = LocalDate.of(1983,6,21);
        Period period = Period.between(geboorte,LocalDate.now());

        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        long dagen = ChronoUnit.DAYS.between(geboorte,LocalDate.now());
        long weken = ChronoUnit.WEEKS.between(geboorte,LocalDate.now());
        long maanden = ChronoUnit.MONTHS.between(geboorte,LocalDate.now());

        System.out.println(dagen);
        System.out.println(weken);
        System.out.println(maanden);

    }
}
