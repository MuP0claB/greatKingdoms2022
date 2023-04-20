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

//    private void checkInput(Runnable function) {
//        String input = scanner.next();
//        try {
//            GameData.setChoice(Integer.valueOf(input));
//        } catch (NumberFormatException e) {
//            System.err.println("\nPlease enter only numbers!");
//            function.run();
//        }
//    }

    public static void takeResources() {

        GameData.currentHero.getResourceByCurrentHero().setQuantity(GameData.currentHero.getResourceByCurrentHero().getQuantity() + 1); // switch (resources)
        GameData.currentHero.healthPoints -= 10;
        System.out.println("\033[32mSuccessfully\033[0m  " + GameData.currentHero.getResourceByCurrentHero().name().toLowerCase());
        System.err.println("< - > < - > < - > < - >");
        mainMenu();
    }

    public static void increaseYourSkills() {
        InstructionHelper.increaseYourSkillsMenu();

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        if(choice ==1){
            if(GameData.currentHero.coins > 100){
                GameData.currentHero.coins -= 100;
                if (GameData.currentHero.name.equals("Marko The Great")) {
                    SuperAbility.HYPER_VENTILATION.increaseAbility();
                } else if (GameData.currentHero.name.equals("Marin The Boss")) {
                    SuperAbility.THUNDER_BOLT.increaseAbility();
                } else {
                    SuperAbility.GETTING_INVISIBLE.increaseAbility();
                }
            } else{
                System.err.println("You don't have enough coins.");
            }
        } else{
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
            case 2 -> guessTheRiddle();
            case 3 -> fightTheMonster();
            case 4 -> solveTheMystery();
            case 5 -> fightWithAnotherEmpire();
            case 6 -> mainMenu();
            default -> chooseYourMission();
        }
    }

    public static void meetTheWizard() {
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

