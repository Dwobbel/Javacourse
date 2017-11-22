package exercises.chapter7;

import exercises.chapter6.KeyboardUtility;

/**
 * Created by KristofB on 22/11/2017.
 */
public class Ex4_LookupTables {
    public static void main(String[] args) {
        System.out.println("Geef een tekst in: \n");
        String text = KeyboardUtility.readStr();
        char[] chars = text.toCharArray();
        int points = 0;
        int[] punten={1,2,3};

        for(int i=0; i< text.length(); i++){
            int index = chars[i] -97;
            points = points + punten[index];
        }
        System.out.println(points);
    }
}
