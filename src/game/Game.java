package game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        makeHeroChoice();

    }

    public static void printMenu() {
        System.out.println("1. Go to shop");
        System.out.println("2. Check inventory");
        System.out.println("3. Take resources");
        System.out.println("4. Increase your skills");
        System.out.println("5. Take your journey");
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
            } catch (Exception e) {
                scanner.nextLine();
                System.out.println(" Input only numbers ");
            }
        }
    }
}

