package game;

public class InstructionHelper {
    public static void printMenu() {
        System.out.println("1. Go to the Market");
        System.out.println("2. Check inventory");
        System.out.println("3. Take resources");
        System.out.println("4. Meet your GURU");
        System.out.println("5. Let's dive into the missions");
        System.out.println("Please choose between 1 & 5 - main menu");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }

    public static void shopInstructions() {
        System.out.println("1. Sell resources");
        System.out.println("2. Buy equipment");
        System.out.println("3. Back to the main menu");
        System.out.println("Please choose between 1 & 3 - shop actions");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }

    public static void printShopEquipment() {
        System.out.println("1. Helmet 🪖 COST: 50 coins. Increase defense: 20 points ");
        System.out.println("2. Shield 🛡️ - 40 coins. Increase defense: 10 points ");
        System.out.println("3. Knife 🗡️ - 40 coins. Increase attack: 15 points ");
        System.out.println("4. Gun 🔫- 50 coins. Increase attack: 25 points ");
        System.out.println("5. Potion - 50 coins. Increase HP with up to 20 ");
        System.out.println("6. Back. ");
        System.out.println("Please select between 1 & 6 to choose your equipment - shop ");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }

    public static void increaseYourSkillsMenu() {
        System.out.println("***********************");
        System.out.println("1. Increase your skills");
        System.out.println("2. Back to the main menu");
        System.out.println("You need 100 coins to increase your skill.");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }

    public static void missionOptions() {
        System.out.println("1. Meet the Wizard");
        System.out.println("2. Guess The Number");
        System.out.println("3. Fight with the mythical monster");
        System.out.println("4. Back to the main menu");
        System.out.println("Please choose between 1 & 4 ");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }

    public static void printHeroInfo(Hero hero) {
        System.out.println("You have chosen " + hero.name + ", has " + hero.healthPoints + " HP, and his super ability is " + hero.ability + ".");

        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }

    public static void printHeroesNames() {
        System.out.println("Choose your Hero:");
        System.out.println("1. Marko The Great   / MOUNTAIN HERO / ");
        System.out.println("2. Triton The Brave   / SEA HERO /");
        System.out.println("3. Mad Max  / LA AREA HERO /");
        System.out.println("Please choose between 1 & 3 ");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }
    public static void printMarketSellerIntro() {
        System.out.println("Welcome to the Market!");
        System.out.println("If you have resources that you want to sell at a good price, you can do so here.");
        System.out.println("The money earned can be used to purchase weapons, armours and other items.");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }
    public static void printGuruIntro(){
        System.out.printf("Hi, I'm your Guru in this game and I noticed that you are interested in improving your skills. \n" +
                "I want to help you become a stronger player and achieve better results in your missions. \n" +
                "I can offer you to learn the latest strategies and techniques as well as give you personal \n" +
                "tips and instruction to improve your super skills.\n" +
                "If you're ready, let's get started!\n");
    }

    public static void instructionsForGuessTheNumberGame() {
        System.out.println("WELCOME TO OUR NEW TRICKY GAME FOR YOU !!!");
        System.out.println("You have to guess the right number from 0 to 50, but you have ONLY 3 tries !!!");
        System.out.println("Enter your number");
    }
    public static void deadHero(){
        System.out.println("You are dead! The game is over!");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }
    public static void deadMonster(){
        System.out.println("The monster is dead! You collect the last piece of map!");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }

    public static void happyEnding(){
        System.out.println("Congratulations !!! 🏆 You have passed all the challenges and save the princess " + GameData.currentHero.location.getPrincessName().name() + GameData.currentHero.location.getPrincessName().princessEmogi);
    }
}
