package Boek2.chapter8.ex2;

public interface TextUtil {
    public static String reverse(String s) {
        StringBuilder builder = new StringBuilder(s);
        return String.valueOf(builder.reverse());
    }
}
