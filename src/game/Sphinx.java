package game;

import java.util.Random;

public class Sphinx extends Monster {

    public Sphinx() {
        super("Sphinx", 100);
    }
//  ATTENTION  ->  monsterFightChallenge() doesn't work properly must change the location of this method  !!!
    @Override
    public void monsterFightChallenge() {
        if (checkMapContent()) {
            System.out.println("You have all the pieces of the Map");
        } else {
            System.out.println("You don't have enough pieces");
        }
    }
}
