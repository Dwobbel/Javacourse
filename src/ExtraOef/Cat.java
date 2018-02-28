package ExtraOef;

/**
 * Created by KristofB on 21/02/2018.
 */
public class Cat extends Mammal {
    @Override
    public void eat() {
        System.out.println("eating cat style");
    }

    @Override
    public void walk() {
        System.out.println("walking cat style");
    }
    public void annoyDog(){
        System.out.println("I gotz your ball");
    }
}
