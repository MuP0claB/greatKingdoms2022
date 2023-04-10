package game;

import com.github.freva.asciitable.AsciiTable;

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
        System.out.println("Please choose between 1 & 5 - main menu");
        int menuChoice = scanner.nextInt();
        switch (menuChoice) {
            case 1:
                market();
                break;
            case 2:
                checkInventory();
                mainMenu();
                break;
            case 3:
                takeResources(); // Пасивно или активно действие.
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

    public static void market() {
        InstructionHelper.shopInstructions();
        Scanner scanner = new Scanner(System.in);
        int menuChoice = scanner.nextInt();

        switch (menuChoice) {
            case 1:
                GameData.currentHero.coins += Market.sellResource(GameData.currentHero.getResource());
                System.out.println(("Your current coins:" + GameData.currentHero.coins));
                market();
                break;
            case 2:
                Market.buyEquipment();
                break;
            case 3:
                mainMenu();
                break;
        }
        mainMenu();
    }

    public static void checkInventory() {
        String[] headers = {"", "Name", "HP", "Monster HP", "Equipment", "Coins"};
        String[][] data = {
                {"1", GameData.currentHero.name, String.valueOf(GameData.currentHero.healthPoints), String.valueOf(GameData.currentHero.location), playerWeapon, String.valueOf(medicine), String.valueOf(numberOfRabbits), String.valueOf(numberOfTrees), goldenKey ? "yes" : "no", caveKey ? "yes" : "no", String.valueOf(playerMoney)}};

//        System.out.println(GameData.currentHero.name);
//        System.out.println(GameData.currentHero.healthPoints);
//        System.out.println(GameData.currentHero.coins);
//        System.out.println(GameData.currentHero.ability);
//        System.out.println(GameData.currentHero.equipmentSet);
//        System.out.println(GameData.currentHero.getResource().getQuantity());

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

