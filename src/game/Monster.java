package game;

import java.util.Map;
import java.util.Random;

import static game.GameData.currentHero;

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

    public String getName() {
        return name;
    }

    public int getMonsterPoints() {
        return monsterPoints;
    }

    public int getMonsterAttack() {
        return monsterAttack;
    }

    public boolean areMissionsCompleted() {
//        Boolean areFinished = !GameData.currentHero.heroMapPieces.containsValue(false);
//        if (!areFinished) {
//            System.out.println("You didn't complete your missions!");
//            Game.chooseYourMission();
//        }
        return !currentHero.heroMapPieces.containsValue(false);
    }

    public int getMonsterDamage () {
        Random rand = new Random();
        int monsterDamage = 0;

        switch(GameData.currentHero.defense) {
            case 0:
                monsterDamage = rand.nextInt(50,60);
                break;
            case 10:
                monsterDamage = rand.nextInt(40,50);
                break;
            case 20:
                monsterDamage= rand.nextInt(30,40);
                break;
            case 30:
                monsterDamage= rand.nextInt(20,30);
                break;
            case 40:
                monsterDamage= rand.nextInt(10,20);
                break;
            default:
                monsterDamage = rand.nextInt(1,10);
        }

        return monsterDamage;
    }
    public int getHeroDamage() {
        Random rand = new Random();
        int heroDamage = 0;
        switch(currentHero.attack){
            case 0:
                heroDamage = rand.nextInt(50,60);
                break;
            case 10:
                heroDamage = rand.nextInt(40,50);
                break;
            case 20:
               heroDamage= rand.nextInt(30,40);
                break;
            case 30:
                heroDamage= rand.nextInt(20,30);
                break;
            case 40:
                heroDamage= rand.nextInt(10,20);
                break;
            default:
                heroDamage = rand.nextInt(1,10);

        }
      return heroDamage;
    }
    public void decreaseMonsterHealthpoints(int heroDamage) {
        this.monsterPoints -= heroDamage;
    }

}
