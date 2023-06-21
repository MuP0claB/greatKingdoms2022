package game.monsters;

import game.GameData;

public class Dagon extends Monster {

    public Dagon() {
        super("Dagon", 100, 220);
    }

    @Override
    public void fightWithMonster() {
        System.out.println("Welcome to the battle with Dagon!");
        System.out.println("Fight !");
        while (GameData.currentHero.healthPoints > 0 && GameData.currentHero.location.getMonster().getMonsterPoints() > 0) {
            super.fightWithMonster();
        }

    }
}
