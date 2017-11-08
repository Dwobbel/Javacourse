package exercises.chapter6;

/**
 * Created by KristofB on 8/11/2017.
 */
public class Ex4_StringBuilder {
    public static void main(String[] args) {
        String text1 = "This is my first line of text";
        String text2 = "This is my second line of text";
        StringBuilder build1 = new StringBuilder(text1);
        StringBuilder build2 = new StringBuilder(text2);
        System.out.println(build1);
        System.out.println(build2);
        build1.append(" and this is what    I added");
        System.out.println(build1);
        build2.reverse();
        System.out.println(build2);

        for (int i = 0; i < build1.length(); i++) {
            if (build1.charAt(i)==' ') {
                build1.deleteCharAt(i);
                i--;
            }
        }
        System.out.println(build1);
        for (int i = 0; i < build2.length(); i++) {
            if (build2.charAt(i)=='t') {
                build2.insert(i, 't');
                i++;
            }
        }
        System.out.println(build2);

    }
}
