package Boek2.chapter8.ex1;

/**
 * Created by KristofB on 7/03/2018.
 */
public class TextPrinterApp {


    public static void main(String[] args) {
        TextPrinter tp = new TextPrinter("Hello this is an example of a sentence containing words");

        System.out.println("*** woorden met een e***");
        tp.printFilteredWords((s -> s.contains("e")));

        System.out.println("*** woorden langer dan vier letters");
        tp.printFilteredWords((s -> s.length() > 4));

        System.out.println("*** woorden die beginnen met a");
        tp.printFilteredWords((s -> s.startsWith("a")));

        System.out.println("*** woorden die als tweede letter een e hebben");
        tp.printFilteredWords((s -> s.startsWith("e", 1)));
        //tp.printFilteredWords((s -> s.charAt(1) == 'e'));

        System.out.println("*** woorden die twee keer de letter e bevatten");
        tp.printFilteredWords( (String s) -> {
          int eCount = 0;
          for (char c : s.toCharArray()) {
              if ('e' == c) {
                  eCount++;
              }
          }
          return eCount == 2;
        });
    }
}
