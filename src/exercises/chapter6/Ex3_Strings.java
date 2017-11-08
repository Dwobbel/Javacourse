package exercises.chapter6;

/**
 * Created by KristofB on 8/11/2017.
 */
public class Ex3_Strings {
    public static void main(String[] args) {
        System.out.println("Geef een tekst in: \n");
        String text = KeyboardUtility.readStr();
        System.out.println(text);
        System.out.println("De lengte van deze tekst is: " + text.length() + " karakters");
        System.out.println("De tekst in allemaal hoofdletters is: " + text.toUpperCase());
        System.out.println("De tekst in allemaal kleine letters is: " + text.toLowerCase());
        System.out.println("Als we alle \"a\" karakters vervangen door \"o\" dan krijgen we: " + text.replace('a', 'o'));
        int teller=0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'e') {
                teller++;
            }
        }
        System.out.println("De letter \"e\" komt " + teller + " keer voor in de tekst.");
        System.out.println("Geef een tweede tekst in: \n");
        String text2 = KeyboardUtility.readStr();
        String concat = text.concat(text2);
        System.out.println("Als we de eerste en tweede tekst samenvoegen krijgen we: " + concat);
        int compare = text.compareTo(text2);
        if (compare < 0) {
            System.out.println("Als we de twee teksten alfabetisch vergelijken is de tweede tekst kleiner.");
        } else if (compare > 0) {
            System.out.println("Als we de twee teksten alfabetisch vergelijken is de eerste tekst kleiner.");
        } else {
            System.out.println("Als we de twee teksten alfabetisch vergelijken zijn de twee teksten gelijk");
        }
        String spaces = "    test    ";
        System.out.println("Als we de string \"" + spaces + "\" trimmen dan krijgen we: " + spaces.trim());

    }
}
