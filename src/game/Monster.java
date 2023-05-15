package game;

import java.util.Map;

import static game.GameData.currentHero;

public abstract class Monster {
    private String name;
    private int monsterPoints;
    private int monsterAttack;
    abstract void monsterFightChallenge();

abstract int monsterDamage();
    public Monster(String name, int monsterPoints, int monsterAttack) {
        this.name = name;
        this.monsterPoints = monsterPoints;
        this.monsterAttack = monsterAttack;
    }

    public boolean areMissionsCompleted() {
//        Boolean areFinished = !GameData.currentHero.heroMapPieces.containsValue(false);
//        if (!areFinished) {
//            System.out.println("You didn't complete your missions!");
//            Game.chooseYourMission();
//        }
        return !currentHero.heroMapPieces.containsValue(false);
    }

}
