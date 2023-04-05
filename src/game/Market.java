package game;

import java.util.Scanner;

public class Market {
    public static int sellResource(Resources resource) {

        if (resource.getQuantity() > 0) {
            resource.setQuantity(resource.getQuantity() - 1);
            System.out.println(resource.name().toLowerCase() + " successfully sold");
            return 10;
        } else {
            System.err.println("Not enough resources");
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
                buyEquipmentInStore("Potion", 30);
                break;
            default:
                InstructionHelper.printShopEquipment();
                break;
        }
        Game.market();
    }

    private static void buyEquipmentInStore(String equipment, int price) {
        if (GameData.currentHero.equipmentSet.contains(equipment)) {
            System.out.println("You already have " + equipment);
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
