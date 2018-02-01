package Boek2.chapter1;

/**
 * Created by KristofB on 31/01/2018.
 */
public class CoinApp {
    public static void main(String[] args) {
        Coin[] munt = new Coin[3];

        munt[0] = Coin.FIFTY_CENT;
        munt[1] = Coin.TWO_CENT;
        munt[2] = Coin.ONE_EURO;

        int totaal = 0;
        for (int i = 0; i < munt.length; i++) {
            totaal = totaal + munt[i].getWaarde();
        }
        System.out.println(totaal);

    }
}