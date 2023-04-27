package game;

public class InstructionHelper {
    public static void printMenu() {
        System.out.println("1. Go to the Market");
        System.out.println("2. Check inventory");
        System.out.println("3. Take resources");
        System.out.println("4. Meet your GURU");
        System.out.println("5. Take your journey");
        System.out.println("Please choose between 1 & 5 - main menu");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }

    // TODO Create method to handle exceptions
    public static void shopInstructions() {
        System.out.println("1. Sell resources");
        System.out.println("2. Buy equipment"); // weapons and equipments
        System.out.println("3. Back to the main menu");
        System.out.println("Please choose between 1 & 3 - shop actions");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }

    public static void printShopEquipment() {
        System.out.println("1. Armour - 50 coins.");
        System.out.println("2. Shield - 40 coins."); // increase hero hp with
        System.out.println("3. Knife - 40 coins.");
        System.out.println("4. Gun - 50 coins.");
        System.out.println("5. Potion - 50 coins."); // increase hero hp with 20%
        System.out.println("6. Back. ");
        System.out.println("Please select between 1 & 6 to choose your equipment - shop ");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }

    public static void takeResources() {
        // TODO: Fill with StoryTelling
    }

    public static void increaseYourSkillsMenu() {
        System.out.println("***********************");
        System.out.println("1. Increase your skills");
        System.out.println("2. Back to the main menu");
        System.out.println("You need 100 coins to increase your skill.");
        System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
    }

    public static void missionOptions() {
        System.out.println("1. Meet the Wizard"); // Магьосникът ти задава 3 въпроса от Стани Богат ;)
        System.out.println("2. Fight with the mythical monster"); // Roll The Dice <-> Героят и чудовището се редуват в хвърлянето на заровете
         // Math.random() и се бият за надмощие
        System.out.println("3. Guess The Number !!!"); //
        // Резервен Вариант : 4. Solve The Mystery <-> Намаляват се с 20 т.
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
        System.out.println("2. Marin The Boss   / SEA HERO /");
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

}
