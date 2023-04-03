package game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        makeHeroChoice();

    }


    public static void makeHeroChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Hero:");
        System.out.println("1. Marko The Great   / MOUNTAIN HERO / ");
        System.out.println("2. Jeana D'Arc   / MOUNTAIN HERO /");
        System.out.println("3. Marin The Boss   / SEA HERO /");
        System.out.println("4. Arielle Little Mermaid   / SEA HERO /");

        int heroChoice = 0;
        while ((heroChoice < 1) || (heroChoice > 4)) {
            System.out.println("Please choose between 1 & 4 ");
            try {
                heroChoice = scanner.nextInt();
                GameData.currentHero = Hero.heroChoise.get(heroChoice);
                System.out.println("You have chosen  " + GameData.currentHero.name);
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println(" Input only numbers ");
            }
        }
        mainMenu();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        InstructionHelper.printMenu();
        int menuChoice = scanner.nextInt();
        System.out.println("Please choose between 1 & 5 ");
        switch (menuChoice) {
            case 1:
                shop();
                break;
            case 2:
                checkInventory();
                break;
            case 3:
                takeResources();
                break;
            case 4:
                increaseYourSkills();
                break;
            case 5:
                chooseYourMission();
                break;
            default:
                mainMenu();
        }
    }

    public static void shop() {
        InstructionHelper.shopInstructions();
        Scanner scanner = new Scanner(System.in);
        int menuChoice = scanner.nextInt();

        switch (menuChoice) {
            case 1:
               GameData.currentHero.coins += Shop.sellResource(GameData.currentHero.getResource());
                System.out.println(("Your current coins:" + GameData.currentHero.coins));
                break;

            case 2:
                Shop.buyEquipment();
                break;
        }
    }

    public static void checkInventory() {
        System.out.println("go back to the main menu");
    }

    public static void takeResources() {
        GameData.currentHero.getResource().setQuantity(GameData.currentHero.getResource().getQuantity() + 1);
        System.out.println("Successfully increase " + GameData.currentHero.getResource().name().toLowerCase());

    }

    public static void increaseYourSkills() {
        InstructionHelper.increaseYourSkills();
    }

    public static void chooseYourMission() {
        InstructionHelper.missionOptions();
        Scanner scanner = new Scanner(System.in);
        int missionChoice = scanner.nextInt();
        System.out.println("Please choose between 1 & 5 ");
        switch (missionChoice) {
            case 1:
                meetTheWizzard();
                break;
            case 2:
                guessTheRiddle();
                break;
            case 3:
                fightTheMonster();
                break;
            case 4:
                solveTheMystery();
                break;
            case 5:
                fightWithAnotherEmpire();
                break;
            case 6:
                mainMenu();
                break;
            default:
                chooseYourMission();
        }
    }

    public static void meetTheWizzard() {
    }

    public static void guessTheRiddle() {
    }

    public static void fightTheMonster() {
    }

    public static void solveTheMystery() {
    }

    public static void fightWithAnotherEmpire() {
    }
}

