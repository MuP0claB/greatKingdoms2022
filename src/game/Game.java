package game;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        chooseLocation();

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

        int choose = scanner.nextInt();
// Избира се location, като се избере локация след това се избира герой.
        След,като се избере герой, той се запазва в даден обект.Запазва се и си остава до края на играта с него.
    }


}