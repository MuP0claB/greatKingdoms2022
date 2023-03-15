package game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        chooseLocation();
//todo Трябва да запазим локацията и героят в Обекти !!!

    }

    public static void printMenu() {
        System.out.println("1. Go to shop");
        System.out.println("2. Check inventory");
        System.out.println("3. Take resources");
        System.out.println("4. Increase your skills");
        System.out.println("5. Take your journey");
    }

    public static void chooseLocation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your location.");
        System.out.println("1. Sea");
        System.out.println("2. Mountain");
        System.out.println("3. Desert");

        int chooseLoc = scanner.nextInt();
        int chooseHero = 0;

        switch (chooseLoc) {
            case 1:
                chooseSeaHero(scanner);
                break;
            case 2:
                chooseMountainHero(scanner);
                break;
            case 3:

                System.out.println("You choose location Desert");
                break;
            default:
                System.out.println("Enter correct number");
                break;
        }
    }

    private static void chooseMountainHero(Scanner scanner) {
        int chooseHero;
        System.out.println("You choose location Mountain");
        System.out.println("Now you have to choose your hero: 1 or 2");
        Hero.printMountainHeroInfo();
        chooseHero = scanner.nextInt();

        if (chooseHero == 1) {
            System.out.println("Your hero is " + Hero.MOUNTAIN_HERO_MALE.name);
        } else if (chooseHero == 2) {
            System.out.println("Your hero is " + Hero.MOUNTAIN_HERO_FEMALE.name);
        } else {
            System.out.println("Enter correct number");
        }
    }

    private static void chooseSeaHero(Scanner scanner) {
        int chooseHero;
        System.out.println("You choose location Sea");
        System.out.println("Now you have to choose your hero: 1 or 2");
        Hero.printSeaHeroInfo();
        chooseHero = scanner.nextInt();

        if (chooseHero == 1) {
            System.out.println("Your hero is " + Hero.SEA_HERO_MALE.name);
        } else if (chooseHero == 2) {
            System.out.println("Your hero is " + Hero.SEA_HERO_FEMALE.name);
        } else {
            System.out.println("Enter correct number");
        }
    }
}