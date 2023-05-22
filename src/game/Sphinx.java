package game;

import java.util.Scanner;

public class Sphinx extends Monster {

    public Sphinx() {
        super("Sphinx", 100, 220);
    }

    @Override
    public void monsterFightChallenge() {
        Scanner scanner = new Scanner(System.in);
        if(!areMissionsCompleted()){
            //TODO go back in chooseYourMission();
        }


        if (GameData.currentHero.healthPoints <= 20) {
            System.out.printf("Your HP are %d. Are you sure you want to proceed? \n 1. Yes \n 2. No", GameData.currentHero.healthPoints);
            int choice = scanner.nextInt();
            if (choice == 1) {
                fightWithMonster();
            } else if (choice == 2) {
                Game.chooseYourMission();
            } else {
                System.out.println("You have to enter valid number!");
                monsterFightChallenge();
            }
        }
        fightWithMonster();

    }

    private void fightWithMonster() {
        while (GameData.currentHero.healthPoints > 0 && this.getMonsterPoints() > 0) {
            GameData.currentHero.healthPoints -= getMonsterDamage();
            decreaseMonsterHealthpoints(getHeroDamage());

            if (GameData.currentHero.healthPoints < 1) {
                InstructionHelper.deadHero();
                GameData.currentHero.healthPoints = 0;
                break;
            } else if (this.getMonsterPoints() < 1) {
                InstructionHelper.deadMonster();
                this.setMonsterPoints(0);
                break;
            }
            System.out.println("Hero HP " + GameData.currentHero.healthPoints);
            System.out.println("Monster HP " + GameData.currentHero.monster.getMonsterPoints());

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

    public int getMonsterPoints() {
        return super.getMonsterPoints();
    }

}
