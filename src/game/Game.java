package game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

       chooseLocation();

    }

    public static void printMenu(){
        System.out.println("1. Go to shop");
        System.out.println("2. Check inventory");
        System.out.println("3. Take resources");
        System.out.println("4. Increase your skills");
        System.out.println("5. Take your journey");
    }
    public static void chooseLocation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your location.");
        System.out.println("1. Sea");
        System.out.println("2. Mountain");
        System.out.println("3. Desert");

        int choose = scanner.nextInt();

        switch (choose){
            case 1:
                Hero.printHeroInfo();
               int heroChoose = scanner.nextInt();
               switch (heroChoose){
                   case 1:
                    Hero hero = Hero.MOUNTAIN_HERO_MALE;

                       break;
                   case 2:
                       break;
               }
                break;
            case 2:
                System.out.println("sdds");
                break;
            case 3:
                System.out.println("dsads");
                break;
        }
    }
}