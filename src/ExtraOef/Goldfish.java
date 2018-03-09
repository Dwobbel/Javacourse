package ExtraOef;

/**
 * Created by KristofB on 21/02/2018.
 */
public class Goldfish extends Fish {
    @Override
    public void eat() {
        System.out.println("eating goldfish style");
    }

    @Override
    public void swim() {
        System.out.println("swimming goldfish style");
    }
    public void searchGold(){
        System.out.println("I gotz gold");
    }
}
