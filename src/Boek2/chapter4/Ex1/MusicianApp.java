package Boek2.chapter4.Ex1;

/**
 * Created by KristofB on 28/02/2018.
 */
public class MusicianApp {
    public static void main(String[] args) {
        Musician muzikant = new Musician();
        muzikant.play();

        Musician.Instrument viool = muzikant.new Instrument();
        viool.makeNoise();

        //of het bovenstaande kan ook geschreven worden als:

        new Musician().play();

        new Musician().new Instrument().makeNoise();
    }
}
