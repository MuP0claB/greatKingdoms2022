package game;

import java.util.Scanner;

public class Market {
    public static int sellResource(Resources resource) {

        if (resource.getQuantity() > 0) {
            resource.setQuantity(resource.getQuantity() - 1);
            System.out.println("You " +"\033[32msuccessfully\033[0m sold " + resource.name().toLowerCase());
            System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
            return 10;
        } else {
            System.out.println("\033[31mNot enough resources\033[0m");
            System.out.println("You current coins: " + GameData.currentHero.coins);
            System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
            return 0;
        }

    }

    public static void buyEquipment() {
        InstructionHelper.printShopEquipment();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                buyEquipmentInStore("Armour", 50);
                break;
            case 2:
                buyEquipmentInStore("Shield", 40);
                break;
            case 3:
                buyEquipmentInStore("Knife", 40);
                break;
            case 4:
                buyEquipmentInStore("Gun", 50);
                break;
            case 5:
                buyEquipmentInStore("Potion", 50);
                break;
            case 6:
                Game.market();
                break;
            default:
                System.out.println("\033Invalid choice\033");
                buyEquipment();
        }
        Game.market();
    }

    private static void buyEquipmentInStore(String equipment, int price) {
        if (GameData.currentHero.equipmentSet.contains(equipment)) {
            System.out.println("You already have " + equipment);
        } else if (equipment.equals("Potion")) {
            if (GameData.currentHero.coins >= 50) {
                GameData.currentHero.coins -= 50;

                if (GameData.currentHero.healthPoints < 80) {
                    GameData.currentHero.healthPoints += 20;
                } else {
                    GameData.currentHero.healthPoints = 100;
                }
                System.out.println("You bought Potion. Now you have " + GameData.currentHero.coins + " coins.");
                System.out.println("Now you have " + GameData.currentHero.healthPoints + " HP.");
            } else {
                System.out.println("You don't have enough money to buy Potion");
            }
        } else {
            if (GameData.currentHero.coins >= price) {
                GameData.currentHero.equipmentSet.add(equipment);
                GameData.currentHero.coins -= price;
                System.out.println("You bought " + equipment + ". Now you have " + GameData.currentHero.coins + " coins.");
                System.out.println("Your equipment is: " + GameData.currentHero.equipmentSet);
            } else {
                System.out.println("You don't have enough money to buy " + equipment);
            }
        }
    }
}
