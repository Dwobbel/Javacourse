package ExtraOef;

/**
 * Created by KristofB on 21/02/2018.
 */
public class Dog extends Mammal {
    @Override
    public void eat() {
        System.out.println("eating dog style");
    }

    @Override
    public void walk() {
        System.out.println("walking dog style");
    }
    public void searchBall(){
        System.out.println("where my ball?");
    }
}
