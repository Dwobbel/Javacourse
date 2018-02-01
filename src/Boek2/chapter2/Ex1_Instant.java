package Boek2.chapter2;

import java.time.*;
/**
 * Created by KristofB on 31/01/2018.
 */
public class Ex1_Instant {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
        System.out.println(now.getNano() + 3);
        System.out.println(now);
        System.out.println(now.plusSeconds(7).plusMillis(5).plusNanos(3));
    }
}
