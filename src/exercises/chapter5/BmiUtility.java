package exercises.chapter5;

/**
 * Created by KristofB on 25/10/2017.
 */
public class BmiUtility {
    public static float calculateBmi(int weight, float height) {
        height = (float) height / 100 ;
        double result = weight / (height * height);
        return (float) result;
    }
    public static void printDiagnose(float bmi){
        System.out.println("uw BMI is " + bmi);
    }
}
