package ExtraOef;

/**
 * Created by KristofB on 21/02/2018.
 */
public class Eagle extends Bird {
    @Override
    public void eat() {
        System.out.println("eating eagle style");
    }

    @Override
    public void fly() {
        System.out.println("flying eagle style");
    }
    public void flyUpsideDown(){
        System.out.println("weeeeeeee");
    }
}
