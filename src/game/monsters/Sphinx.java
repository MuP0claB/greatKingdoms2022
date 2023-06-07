package game.monsters;

import game.GameData;

public class Sphinx extends Monster {

    public Sphinx() {
        super("Sphinx", 100, 220);
    }

    public int getMonsterPoints() {
        return super.getMonsterPoints();
    }

    public void fightWithSphinx() {
        while (GameData.currentHero.healthPoints > 0 && GameData.currentHero.location.getMonster().getMonsterPoints() > 0) {
            System.out.println("Welcome to the battle with Sphinx!");
            System.out.println("Fight !");
            super.fightWithMonster();
        }
    }
}
