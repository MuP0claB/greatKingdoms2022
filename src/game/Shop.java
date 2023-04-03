package game;

import java.util.Scanner;

public class Shop {
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
                if (GameData.currentHero.equipmentSet.contains("Armour")) {
                    System.out.println("You already have Armour");
                } else {
                    if (GameData.currentHero.coins >= 50) {
                        GameData.currentHero.equipmentSet.clear();
                        GameData.currentHero.equipmentSet.add("Armour");
                        GameData.currentHero.coins -= 50;
                        System.out.println("You bought Armour. Now you have " + GameData.currentHero.coins + "coins.");
                        System.out.println("Your weapon is: " + GameData.currentHero.equipmentSet);
                    } else {
                        System.out.println("You don't have enough money to buy Armour");
                    }
                }
                break;
            case 2:
                //System.out.println("Shield");

                break;
            case 3:
                System.out.println("Knife");
                break;
            case 4:
                System.out.println("Gun");
                break;
            case 5:
                System.out.println("Potion");
                break;
            default:
                InstructionHelper.printShopEquipment();
        }
        Game.shop();
    }
}
