package game;

import java.util.Random;

public class Sasquatch extends Monster {

    public Sasquatch() {
        super("Sasquatch", 100, 170);
    }


    void monsterFightChallenge() {
        System.out.println(areMissionsCompleted());
        //TODO while hero HP>0 repeat until smn die.(

        //TODO build logic for the fight
    }
    public void fightWithSasquatch () {
        fightWithMonster();
    }
}
