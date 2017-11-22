package exercises.chapter7;

import exercises.chapter5.KeyboardUtility;

/**
 * Created by KristofB on 22/11/2017.
 */
public class Ex5_VariableParam {
    public static int average(int...values){
        int total = 0;
        for (int el :values) {
            total += el;
        }
        return total/values.length;
    }

    public static int min(int...values){
        int minimum = values[0];
        for (int el:values){
            if (el < minimum){
                minimum = el;
            }
        }
        return minimum;
    }
    public static int max(int...values) {
        int maximum = values[0];
        for (int el : values) {
            if (el > maximum) {
                maximum = el;
            }
        }
        return maximum;
    }
    public static void main(String[] args) {
        System.out.println(average(2, 3, 4, 5, 5, 6));
        System.out.println(min(2, 3, 4, 1, 5, 7));
        System.out.println(max(5, 3, 7, 44));
    }

}
