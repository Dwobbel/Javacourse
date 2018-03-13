package Boek2.chapter8.ex2;

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
    public void printProcessedWords(WordProcessor processor) {
        for (String w : s.split(" ")){
            System.out.println(processor.process(w));
        }
    }
}
