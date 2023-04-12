package game;

public class InstructionHelper {
    public static void printMenu() {
        System.out.println("1. Go to the Market");
        System.out.println("2. Check inventory");
        System.out.println("3. Take resources");
        System.out.println("4. Increase your skills");
        System.out.println("5. Take your journey");
        System.err.println("< - > < - > < - > < - >");
    }

    // TODO Create method to handle exceptions
    public static void shopInstructions() {
        System.out.println("1. Sell resources");
        System.out.println("2. Buy equipment"); // weapons and equipments
        System.out.println("3. Back to the main menu");
        System.out.println("Please choose between 1 & 3 - shop actions");
        System.err.println("< - > < - > < - > < - >");
    }

    public static void printShopEquipment() {
        System.out.println("1. Armour - 50 coins.");
        System.out.println("2. Shield - 40 coins."); // increase hero hp with
        System.out.println("3. Knife - 40 coins.");
        System.out.println("4. Gun - 50 coins.");
        System.out.println("5. Potion - 50 coins."); // increase hero hp with 20%
        System.out.println("6. Back. ");
        System.out.println("Please select between 1 & 6 to choose your equipment - shop ");
        System.err.println("< - > < - > < - > < - >");
    }

    public static void takeResources() {
        // TODO: Fill with StoryTelling
    }

    public static void increaseYourSkills() {
        System.out.println("1. Increase your skills");
        // TODO: Brainstorming about SKILLS
        System.out.println("2. Back to the main menu");
        System.err.println("< - > < - > < - > < - >");
    }

    public static void missionOptions() {
        System.out.println("1. Meet the Wizard");
        System.out.println("2. Guess the riddle");
        System.out.println("3. Fight with the mythical monster");
        System.out.println("4. Solve the mystery");
        System.out.println("5. Fight with the hero of another empire");
        System.out.println("6. Back to the main menu");
        System.err.println("< - > < - > < - > < - >");

    }

    public static void printHeroInfo(Hero hero) {
        System.out.println("You have chosen " + hero.name + ", has " + hero.healthPoints + " HP, and his super ability is " + hero.ability + ".");
    }

    public static void printHeroesNames() {
        System.out.println("Choose your Hero:");
        System.out.println("1. Marko The Great   / MOUNTAIN HERO / ");
        System.out.println("2. Marin The Boss   / SEA HERO /");
        System.out.println("3. Mad Max  / LA AREA HERO /");
    }
}
