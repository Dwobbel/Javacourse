package Boek2.chapter4.Ex3;


/**
 * Created by KristofB on 28/02/2018.
 */
public class Musician {
    public void play() {

        Instrument instrument = new Instrument() {
            @Override
            public void makeNoise() {
                System.out.println("meuh");
            }
        };
        instrument.makeNoise();

    }
}
