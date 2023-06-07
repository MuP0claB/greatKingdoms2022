package game.monsters;

import game.Game;
import game.GameData;
import game.InstructionHelper;
import game.StoryTelling;

import java.util.Random;
import java.util.Scanner;

import static game.GameData.currentHero;

public abstract class Monster {
    private String name;

    private int monsterPoints;

    private int monsterAttack;


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

    public int getMonsterDamage() {
        Random rand = new Random();
        int monsterDamage = 0;

        switch (GameData.currentHero.defence) {
            case 0:
                monsterDamage = rand.nextInt(51, 60);
                break;
            case 10:
                monsterDamage = rand.nextInt(41, 50);
                break;
            case 20:
                monsterDamage = rand.nextInt(21, 25);
                break;
            case 30:
                monsterDamage = rand.nextInt(15, 20);
                break;
            case 40:
                monsterDamage = rand.nextInt(8, 12);
                break;
            case 50:
                monsterDamage = rand.nextInt(4, 7);
                break;
            case 60:
                monsterDamage = rand.nextInt(1, 3);
                break;
            default:
                monsterDamage = rand.nextInt(1, 10);
        }
        return monsterDamage;
    }

    public int getHeroDamage() {
        Random rand = new Random();
        int hAttack = currentHero.attack;
        int heroDamage = 0;
        if (hAttack <= 10) {
            heroDamage = rand.nextInt(1, 5);
        } else if (hAttack <= 20) {
            heroDamage = rand.nextInt(6, 10);
        } else if (hAttack <= 30) {
            heroDamage = rand.nextInt(11, 15);
        } else if (hAttack <= 40) {
            heroDamage = rand.nextInt(26, 30);
        } else if (hAttack <= 50) {
            heroDamage = rand.nextInt(31, 40);
        } else {
            heroDamage = rand.nextInt(41, 50);
        }
        return heroDamage;
    }

    public void decreaseMonsterHealthPoints(int heroDamage) {
        this.monsterPoints -= heroDamage;
    }

    public void setMonsterPoints(int monsterPoints) {
        this.monsterPoints = monsterPoints;
    }

    protected void fightWithMonster() {

        while (GameData.currentHero.healthPoints > 0 && this.getMonsterPoints() > 0) {
            GameData.currentHero.healthPoints -= getMonsterDamage();
            decreaseMonsterHealthPoints(getHeroDamage());

            if (GameData.currentHero.healthPoints < 1) {
                InstructionHelper.deadHero();
                GameData.currentHero.healthPoints = 0;
                return;
                
            } else if (this.getMonsterPoints() < 1) {
                InstructionHelper.deadMonster();
                this.setMonsterPoints(0);
                InstructionHelper.happyEnding();
                StoryTelling.printWinStory();
                return;
            }
            System.out.println("Hero HP " + GameData.currentHero.healthPoints);
            System.out.println("Monster HP " + currentHero.location.getMonster().getMonsterPoints());

            optionToRun();
        }
    }

    public void optionToRun() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Continue \n2. Run");

        int choice = scanner.nextInt();

        if (choice == 1) {
            fightWithMonster();
        } else if (choice == 2) {
            Game.mainMenu();
        } else {
            System.out.println("You have to enter valid number!");
            optionToRun();
        }
    }
}