package ExtraOef;

/**
 * Created by KristofB on 21/02/2018.
 */
public class Crow extends Bird {
    @Override
    public void eat() {
        System.out.println("eating crow style");
    }

    @Override
    public void fly() {
        System.out.println("flying crow style");
    }

    public void stealShit(){
        System.out.println("mineminemine");
    }
}
