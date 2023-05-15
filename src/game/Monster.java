package game;

import java.util.Map;

public abstract class Monster {
    private String name;
    private int monsterPoints;
    private int monsterAttack;
    abstract void monsterFightChallenge();

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
        return !GameData.currentHero.heroMapPieces.containsValue(false);
    }
}
