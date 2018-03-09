package Boek2.chapter4.Ex2;


/**
 * Created by KristofB on 28/02/2018.
 */
public class Musician {
    public void play() {

        class Instrument {
            public void makeNoise() {
                System.out.println("LAWAAI");
            }
        }
        new Instrument().makeNoise();

    }
}
