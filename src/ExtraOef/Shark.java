package ExtraOef;

/**
 * Created by KristofB on 21/02/2018.
 */
public class Shark extends Fish {
    @Override
    public void eat() {
        System.out.println("eating shark style");
    }

    @Override
    public void swim() {
        System.out.println("swimming shark style");
    }

    public void swimUpsidedown(){
        System.out.println("upsidedown swimming");
    }
}
