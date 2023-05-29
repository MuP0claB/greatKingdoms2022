package game;

import java.util.Scanner;

public class Sphinx extends Monster {

    public Sphinx() {
        super("Sphinx", 100, 220);
    }

    @Override
    public void monsterFightChallenge() {
        Scanner scanner = new Scanner(System.in);

        if (!areMissionsCompleted()) {
            System.out.println("You don't have  the  pieces to continue");
            Game.chooseYourMission();
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

    public int getMonsterPoints() {
        return super.getMonsterPoints();
    }

    public void fightWithSphinx () {
        fightWithMonster();
    }
}
