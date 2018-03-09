package ExtraOef;

/**
 * Created by KristofB on 21/02/2018.
 */
public class Lizard extends Amphibious {
    @Override
    public void eat() {
        System.out.println("eating lizard style");
    }

    @Override
    public void crawl() {
        System.out.println("crawling lizard style");

    }
    public void changecolor(){
        System.out.println("where did he go?");
    }
}
