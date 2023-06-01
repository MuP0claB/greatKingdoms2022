package game;

import com.github.freva.asciitable.AsciiTable;
import game.monsters.Dagon;
import game.monsters.Monster;
import game.monsters.Sasquatch;
import game.monsters.Sphinx;

import java.util.*;

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
                InstructionHelper.printMarketSellerIntro();
                market();
                break;
            case 2:
                checkInventory();
                break;
            case 3:
                takeResources();
                break;
            case 4:
                InstructionHelper.printGuruIntro();
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
                market();
                break;
            case 2:
                Market.buyEquipment();
                break;
            case 3:
                mainMenu();
                break;
            default:
                System.out.println("\033[31mInvalid choice!\033[0m");
                market();
        }
    }

    public static void checkInventory() {
        String[] headers = {"", "Name", "Your HP", "Monster", "Monster HP", "Equipment", "Coins", "Resources", "Attack", "Defence"};
        String[][] data = {{"1",
                GameData.currentHero.name,
                String.valueOf(GameData.currentHero.healthPoints),
                String.valueOf(GameData.currentHero.location.getMonster().getName()),
                String.valueOf(GameData.currentHero.location.getMonster().getMonsterPoints()),
                String.valueOf(GameData.currentHero.equipmentSet).replace("[", "").replace("]", ""),
                String.valueOf(GameData.currentHero.coins),
                String.valueOf(GameData.currentHero.getResourceByCurrentHero().getQuantity()),
                String.valueOf(GameData.currentHero.attack),
                String.valueOf(GameData.currentHero.defence)
        }};
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
        //  mainMenu();
    }

    public static void chooseYourMission() {
        InstructionHelper.missionOptions();
        Scanner scanner = new Scanner(System.in);
        int missionChoice = scanner.nextInt();
        switch (missionChoice) {
            case 1 -> meetTheWizard(GameData.currentHero.heroMapPieces);
            case 2 -> guessTheNumber(GameData.currentHero.heroMapPieces);
            case 3 -> fightTheMonster();
            case 4 -> mainMenu();
            default -> chooseYourMission();
        }
    }

    public static List<String> wizardQuestions(int num) {
        List<String> question = new ArrayList<>();
        switch (num) {
            case 1:
                question.add("What is Java?");
                question.add("a) A computer hardware");
                question.add("b) An operating system");
                question.add("c) A programming language");
                question.add("c");
                break;
            case 2:
                question.add("What is the main benefit of using object-oriented programming in Java?");
                question.add("a) More efficient use of computer memory");
                question.add("b) Faster program execution");
                question.add("c) Improved code organization and maintenance");
                question.add("c");
                break;
            case 3:
                question.add("Which of the following data types is NOT a primitive data type in Java?");
                question.add("a) int");
                question.add("b) double");
                question.add("c) String");
                question.add("c");
                break;
            case 4:
                question.add("What is the output of the following code snippet?");
                question.add("int a = 5;");
                question.add("int b = 10;");
                question.add("System.out.println(a + b + is the sum of a and b);");
                question.add("a) 510 is the sum of a and b");
                question.add("b) 15 is the sum of a and b");
                question.add("c) 5 + 10 is the sum of a and b");
                question.add("b");
                break;
        }
        return question;
    }

    public static void meetTheWizard(Map<String, Boolean> mapPieces) {
        isMissionCompleted("Meet the Wizard");
        Scanner scanner = new Scanner(System.in);

        if (GameData.currentHero.healthPoints <= 10) {
            System.out.println("You don't have enough HP to start that mission!");
            mainMenu();
            return;
        }

        int correctAnswers = 0;
        Set<Integer> numbersOfQuestion = new HashSet<>();
        List<String> question;

        Random rand = new Random();
        while (numbersOfQuestion.size() < 3) {
            int num = rand.nextInt(3) + 1;
            numbersOfQuestion.add(num);
        }

        for (Integer num : numbersOfQuestion) {
            question = wizardQuestions(num);
            String correctAnswer = question.remove(question.size() - 1);

            for (String s : question) {
                System.out.println(s);
            }
            String userInput = scanner.nextLine();

            while (!(userInput.equals("a") || userInput.equals("b") || userInput.equals("c"))) {
                System.out.println("Please enter only valid letters");
                userInput = scanner.nextLine();
            }

            if (userInput.equals(correctAnswer)) {
                correctAnswers++;
                System.out.println("Your answer is correct!");
            } else {
                System.out.println("Your answer is NOT correct!");
            }
        }

        if (correctAnswers == 3) {
            System.out.println("Congratulations!");
            mapPieces.put("Meet the Wizard", true);
            System.out.println(mapPieces);
        } else {
            System.out.println("Come back when you have learned Java better! \033[31mYou lost 10 HP!\033[0m");
            GameData.currentHero.healthPoints -= 10;
        }
        chooseYourMission();
    }


    public static void isMissionCompleted(String nameOfMission) {
        if (GameData.currentHero.heroMapPieces.get(nameOfMission)) {
            System.out.println("You already have this piece of the map");
            System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
            chooseYourMission();
        }
    }

    public static void guessTheNumber(Map<String, Boolean> mapPieces) {
        isMissionCompleted("Guess the number");
        InstructionHelper.instructionsForGuessTheNumberGame();
        Scanner scanner = new Scanner(System.in);
        int current = new Random().nextInt(51);
        boolean isCorrect = false;
        for (int i = 0; i < 3; i++) {
            int digit = scanner.nextInt();
            if (digit == current) {
                isCorrect = true;
                break;
            } else {
                if (digit > current) {
                    System.out.println("Too high ! 📈");
                } else {
                    System.out.println("Too low ! 📉");
                }
            }
        }
        if (isCorrect) {
            System.out.println("You guess THE NUMBER");
            System.out.println("You've got another piece of Map !");
            mapPieces.put("Guess the number", true);
        } else {
            System.out.println("YOU FAILED ! THE NUMBER IS " + current);
        }
        chooseYourMission();
    }

    //It has to be the first method when enter the mission.
    public static void fightTheMonster() {
        Monster monster = GameData.currentHero.location.getMonster();
        if (monster instanceof Sphinx) {
            Sphinx sphinx = (Sphinx) monster;
            sphinx.fightWithSphinx();
        } else if (monster instanceof Dagon) {
            Dagon dagon = (Dagon) monster;
            dagon.fightWithDagon();
        } else if (monster instanceof Sasquatch) {
            Sasquatch sasquatch = (Sasquatch) monster;
            sasquatch.fightWithSasquatch();
        }
    }

}

// String -> boolean
// "Meet The Wizard" -> false;
// "Guess The Number" = false;
// "Fight The Monster" -> false;
