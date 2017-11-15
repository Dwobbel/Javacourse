package exercises.chapter7;

/**
 * Created by KristofB on 15/11/2017.
 */
public class Ex1_Arrays {
    public static void main(String[] args) {
            int[] numbers = new int[20];
        for (int i=0; i<20; i++){
            numbers[i] = (i+1) *7;
            //System.out.println(numbers[i]);
        }
        for(int n: numbers) {
            System.out.println(n);
        }
        for (int i = 19; i>-1; i--){
            numbers[i] = (i+1) *7;
            System.out.println(numbers[i]);
        }

    }
}
