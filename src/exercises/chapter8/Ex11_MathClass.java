package exercises.chapter8;

import static java.lang.Math.*;
/**
 * Created by KristofB on 6/12/2017.
 */
public class Ex11_MathClass {
    public static void main(String[] args) {
        double einde = Math.PI*2;

        for (double radiaal = 0; radiaal < Math.PI*2; radiaal+=0.1){
            double cosinus = Math.cos(radiaal);
            double graden = Math.toDegrees(radiaal);
            //System.out.println("Radiaal: "+ radiaal + " - Cosinus: " +cosinus + " - In graden: " + graden);
            System.out.printf("Radiaal: %.2f - Cosinus: %.2f - In graden: %.0f %n", radiaal, cosinus, graden);
        }

    }
}
