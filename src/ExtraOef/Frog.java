package ExtraOef;

/**
 * Created by KristofB on 21/02/2018.
 */
public class Frog extends Amphibious {
    @Override
    public void eat() {
        System.out.println("eating frog style");
    }

    @Override
    public void crawl() {
        System.out.println("crawling frog style");
    }

    public void catchFlies(){
        System.out.println("I gotz fliez");
    }
}
