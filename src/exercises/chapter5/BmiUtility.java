package exercises.chapter5;

/**
 * Created by KristofB on 25/10/2017.
 */
public class BmiUtility {
    public static float calculateBmi(int weight, int height) {
        float calculate = (float) height / 100;
        float result = weight / (calculate * calculate);
        return result;
    }
    public static void printDiagnose(float bmi){
        System.out.println("Uw BMI is " + (int) bmi);
        if (bmi < 20) {
            System.out.println("Dit is ondergewicht.");
        } else if (bmi < 25) {
            System.out.println("Dit is ok");
        } else if (bmi < 30) {
            System.out.println("Dit is overgewicht");
        } else if (bmi < 40) {
            System.out.println("Dit is obesitas");
        } else {
            System.out.println("Dit is ziekelijk overgewicht");
        }
    }
}
