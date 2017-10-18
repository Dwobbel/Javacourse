package exercises.chapter5;

/**
 * Created by KristofB on 18/10/2017.
 */
public class Ex17_8_For {
    public static void main(String[] args) {
        int Teller = 1;
        for (int number = 2; number <1000; number++){
            int i;
            boolean prime=true;
            for (i = 2; i < number && prime ;i++){
                if (number%i==0){
                    prime=false;
                }
            }
            if (prime==true){
                Teller++;
                System.out.println("Getal nummer "+ Teller +" = " +number);

            }
        }
    }
}
