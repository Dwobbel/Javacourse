package Boek2.chapter2;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * Created by KristofB on 7/02/2018.
 */
public class Ex4_Timezones {
    public static void main(String[] args) {
        ZoneId londonZone = ZoneId.of("Europe/London");
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        ZoneId AdelaitiZone = ZoneId.of("Australia/Adelaide");
        ZoneId UTC4Zone = ZoneId.of("UTC-4");

        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now(londonZone));
        System.out.println(ZonedDateTime.now(sydneyZone));
        System.out.println(ZonedDateTime.now(AdelaitiZone));
        System.out.println(ZonedDateTime.now(UTC4Zone));
    }
}
