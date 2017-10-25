package exercises.chapter5;

/**
 * Created by KristofB on 25/10/2017.
 */
public class Ex18_Methods {
    public static void main(String[] args) {
        System.out.println("Enter your length (cm) ");
        int height = KeyboardUtility.readInt();
        System.out.println("Enter your weight (kg) ");
        int weight = KeyboardUtility.readInt();
        float bmi = BmiUtility.calculateBmi(weight, height);
        BmiUtility.printDiagnose(bmi);
    }
}
