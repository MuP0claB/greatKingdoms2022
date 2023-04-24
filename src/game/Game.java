package game;

import com.github.freva.asciitable.AsciiTable;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        makeHeroChoice();

    }

    public static void makeHeroChoice() {
        Scanner scanner = new Scanner(System.in);
        InstructionHelper.printHeroesNames();

        int heroChoice = 0;
        while ((heroChoice < 1) || (heroChoice > 3)) {
            try {
                heroChoice = scanner.nextInt();
                GameData.currentHero = Hero.heroChoise.get(heroChoice);
                InstructionHelper.printHeroInfo(GameData.currentHero);
            } catch (Exception e) {
                scanner.nextLine();
                System.err.println("Input only VALID NUMBERS");
            }
        }
        mainMenu();
    }

    public static void mainMenu() {
        Scanner scanner = new Scanner(System.in);
        InstructionHelper.printMenu();
        int menuChoice = scanner.nextInt();
        switch (menuChoice) {
            case 1:
                market();
                break;
            case 2:
                checkInventory();
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
                GameData.currentHero.coins += Market.sellResource(GameData.currentHero.getResourceByCurrentHero());
                System.out.println(("Your current coins: " + GameData.currentHero.coins));
                market();
                break;
            case 2:
                Market.buyEquipment();
                break;
            case 3:
                mainMenu();
                break;
            default:
                System.err.println("Invalid choice!");
                market();
        }
        mainMenu();
    }

    public static void checkInventory() {
        String[] headers = {"", "Name", "Your HP", "Monster", "Monster HP", "Equipment", "Coins", "Resources"};
        String[][] data = {
                {"1", GameData.currentHero.name, String.valueOf(GameData.currentHero.healthPoints), String.valueOf(GameData.currentHero.location.getMonsterName()), String.valueOf(GameData.currentHero.location.getMonsterPoints()), String.valueOf(GameData.currentHero.equipmentSet).replace("[", "").replace("]", ""), String.valueOf(GameData.currentHero.coins), String.valueOf(GameData.currentHero.getResourceByCurrentHero().getQuantity())}};
        System.out.println(AsciiTable.getTable(headers, data));
        mainMenu();
    }

    public static void takeResources() {

        if (GameData.currentHero.healthPoints > 10 && GameData.currentHero.getResourceByCurrentHero().getQuantity() < 3) {
            GameData.currentHero.getResourceByCurrentHero().setQuantity(GameData.currentHero.getResourceByCurrentHero().getQuantity() + 1); // switch (resources)
            GameData.currentHero.healthPoints -= 10;
            System.out.println("\033[32mSuccessfully added\033[0m  " + GameData.currentHero.getResourceByCurrentHero().name().toLowerCase());
            System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
        } else if (GameData.currentHero.healthPoints <= 10) {
            System.out.println("Your " + GameData.currentHero.healthPoints + " HP are not enough to take resource.");
        } else if (GameData.currentHero.getResourceByCurrentHero().getQuantity() >= 3) {
            System.out.println("\033[31mYou can't take more than 3 !\033[0m");
        }
        mainMenu();
    }

    public static void increaseYourSkills() {
        InstructionHelper.increaseYourSkillsMenu();

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        if (choice == 1) {
            if (GameData.currentHero.coins >= 100) {
                GameData.currentHero.coins -= 100;
                if (GameData.currentHero.name.equals("Marko The Great")) {
                    SuperAbility.HYPER_VENTILATION.increaseAbility();
                } else if (GameData.currentHero.name.equals("Marin The Boss")) {
                    SuperAbility.THUNDER_BOLT.increaseAbility();
                } else {
                    SuperAbility.GETTING_INVISIBLE.increaseAbility();
                }
            } else {
                System.out.println("\033[31mYou don't have enough coins.\033[0m");
            }
        } else {
            mainMenu();
        }
        mainMenu();
    }

    public static void chooseYourMission() {
        InstructionHelper.missionOptions();
        Scanner scanner = new Scanner(System.in);
        int missionChoice = scanner.nextInt();
        System.out.println("Please choose between 1 & 6 ");
        switch (missionChoice) {
            case 1 -> meetTheWizard();
            case 2 -> fightTheMonster();
            case 3 -> solveTheMystery();
            case 4 -> mainMenu();
            default -> chooseYourMission();
        }
    }

    public static void meetTheWizard() {
    }

    public static void fightTheMonster() {
    }

    public static void solveTheMystery() {
    }
}

