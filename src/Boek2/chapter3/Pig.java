package Boek2.chapter3;

/**
 * Created by KristofB on 7/02/2018.
 */
public interface Pig {
    void grunt();
    default void fly(){
        System.out.println("Pigs can't fly");
    }
}
