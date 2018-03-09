package Boek2.chapter8.ex1;

/**
 * Created by KristofB on 7/03/2018.
 */
public class TextPrinter {
    private String s;

    public TextPrinter(String s) {
        this.s = s;
    }

    public void printFilteredWords(WordFilter filter) {
        for (String w : s.split(" ")){
            if (filter.isValid(w)) {
                System.out.println(w);
            }
        }
    }
}
