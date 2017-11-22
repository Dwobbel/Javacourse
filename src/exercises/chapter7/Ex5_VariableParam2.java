package exercises.chapter7;

import exercises.chapter6.KeyboardUtility;

/**
 * Created by KristofB on 22/11/2017.
 */
public class Ex5_VariableParam2 {


    public static void main(String[] args) {

        System.out.println("Geef getallen in en typ \"stop\" om te stoppen met ingeven \n");
        String text = KeyboardUtility.readStr();
        while(!text.equals("stop")){
            int index = 0;
            int nummer = Integer.parseInt(text);

            text = KeyboardUtility.readStr();

        }

    }

}
