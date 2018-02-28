package ExtraOef;


import ExtraOef.ExtraOef2.*;

/**
 * Created by KristofB on 21/02/2018.
 */
public class AnimalApp {
    public static void main(String[] args) {
        int initialsize = 10;
        Goldfish blub = new Goldfish();
        Shark haai = new Shark();
        Dog woef = new Dog();
        Cat miauw = new Cat();
        Frog ribbit = new Frog();
        Lizard eddy = new Lizard();
        Eagle arend = new Eagle();
        Crow kraai = new Crow();
        Eagle bold = new Eagle();

        Airplane vliegtuig = new Airplane();
        Drone droon = new Drone();
        Car vroem = new Car();
        Moto brommer = new Moto();


        Fish[] fish = new Fish[initialsize];
        Mammal[] mammal = new Mammal[initialsize];
        Amphibious[] amphibious = new Amphibious[initialsize];
        Bird[] bird = new Bird[initialsize];
        Animal[] animal = new Animal[bird.length + mammal.length + amphibious.length + fish.length];


        Air[] air = new Air[initialsize];
        Ground[] ground = new Ground[initialsize];
        Mechanical[] mecha = new Mechanical[air.length + ground.length];


        air[0] = vliegtuig;
        air[1] = droon;

        ground[0] = vroem;
        ground[1] = brommer;

        Object[] test = new Object[initialsize];

        test[0] = arend;
        test[1] = vliegtuig;

        //   === Zonder interfaces ===
        /*for (Object vliegen : test) {
            if (vliegen != null) { //checken of het niet null is
                if (vliegen instanceof Air){ //vliegen casten naar een instance van Air omdat vliegen een object is (moet eerst gecast worden)
                    ((Air) vliegen).fly();
                } else if (vliegen instanceof Bird) { // same, casten naar instance van Bird om fly te bekomen
                    ((Bird) vliegen).fly();
                }
            }
        }
        */

        Flyable[] vliegding = new Flyable[initialsize];

        vliegding[0] = vliegtuig;
        vliegding[1] = kraai;


        for (Flyable vlieg : vliegding) {
            if (vlieg != null) {
                vlieg.fly();
            }
        }



        bird[0] = arend;
        bird[1] = kraai;
        bird[2] = bold;

        fish[0] = blub;
        fish[1] = haai;

        mammal[0] = woef;
        mammal[1] = miauw;

        amphibious[0] = ribbit;
        amphibious[1] = eddy;

        for (Bird v : bird) {
            if (v != null) {
                v.fly();
                if (v instanceof Crow) {
                    ((Crow) v).stealShit();
                } else if (v instanceof Eagle) {
                    ((Eagle) v).flyUpsideDown();
                }
            }
        }
        int animalsIndex = 0;

        for (Bird vog : bird) {
            if (vog != null) {
                animal[animalsIndex++] = vog;
            }

        }

        for (Mammal mam : mammal) {
            if (mam != null) {
                animal[animalsIndex++] = mam;
            }
        }

        for (Amphibious amp : amphibious) {
            if (amp != null) {
                animal[animalsIndex++] = amp;
            }
        }

        for (Fish vis : fish) {
            if (vis != null) {
                animal[animalsIndex++] = vis;
            }
        }

        for (Animal ani : animal) {
            if (ani != null) {
                ani.eat();
            }
        }

    }
}
