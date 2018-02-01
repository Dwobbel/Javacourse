package Boek2.chapter1;

/**
 * Created by KristofB on 31/01/2018.
 */
public enum Day {
    Maandag(true),Dinsdag(true),Woensdag(true),Donderdag(true),Vrijdag(true),Zaterdag(false),Zondag(false);

    private boolean weekdag;

    Day(boolean weekdag) {
        this.weekdag = weekdag;
    }

    public boolean getDay() {
        return weekdag;
    }

    @Override
    public String toString() {
        return name() + " is een weekdag? " + weekdag;
    }
}
