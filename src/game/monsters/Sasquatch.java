package game.monsters;

import game.GameData;

public class Sasquatch extends Monster {

    public Sasquatch() {
        super("Sasquatch", 100, 170);
    }

    public void fightWithSasquatch() {
        System.out.println("Welcome to the battle with Sasquatch!");
        System.out.println("Fight !");

        fightWithMonster();

    }
}
