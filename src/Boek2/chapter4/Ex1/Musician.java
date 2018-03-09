package Boek2.chapter4.Ex1;


/**
 * Created by KristofB on 28/02/2018.
 */
public class Musician {
    public class Instrument {
        public void makeNoise(){
            System.out.println("LAWAAI");
        }
    }

    public void play() {
        Instrument instrument = new Instrument();
        instrument.makeNoise();
        System.out.println("mooi lawaai");
    }
}
