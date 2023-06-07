package game.monsters;

import game.GameData;

public class Dagon extends Monster {

    public Dagon() {
        super("Dagon", 100, 220);
    }

    public void fightWithDagon() {
        while (GameData.currentHero.healthPoints > 0 && GameData.currentHero.location.getMonster().getMonsterPoints() > 0) {
            System.out.println("Welcome to the battle with Dagon!");
            System.out.println("Fight !");
            super.fightWithMonster();
        }

    }
}
