package exercises.chapter5;

import java.io.*;
/**
 * Created by KristofB on 11/10/2017.
 */
public class Ex15_Switch {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter character");
        char c = (char) System.in.read();
        int points = 0;
        switch (c) {
            case 'a': points = 1; break;
            case 'b': points = 3; break;
            case 'c': points = 3; break;
            case 'd': points = 2; break;
            case 'e': points = 1; break;
            case 'f': points = 4; break;
            case 'g': points = 2; break;
            case 'h': points = 4; break;
            case 'i': points = 1; break;
            case 'j': points = 8; break;
            case 'k': points = 5; break;
            case 'l': points = 1; break;
            case 'm': points = 3; break;
            case 'n': points = 1; break;
            case 'o': points = 1; break;
            case 'p': points = 3; break;
            case 'q': points = 10; break;
            case 'r': points = 1; break;
            case 's': points = 1; break;
            case 't': points = 1; break;
            case 'u': points = 1; break;
            case 'v': points = 4; break;
            case 'w': points = 4; break;
            case 'x': points = 8; break;
            case 'y': points = 4; break;
            case 'z': points = 10; break;
        }
        System.out.println(points);
    }
}
