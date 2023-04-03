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
                if (GameData.currentHero.equipmentSet.contains("Shield")) {
                    System.out.println("You already have Shield");
                } else {
                    if (GameData.currentHero.coins >= 40) {
                        GameData.currentHero.equipmentSet.add("Shield");
                        GameData.currentHero.coins -= 40;
                        System.out.println("You bought Shield. Now you have " + GameData.currentHero.coins + "coins.");
                        System.out.println("Your weapon is: " + GameData.currentHero.equipmentSet);
                    } else {
                        System.out.println("You don't have enough money to buy Shield");
                    }
                }
                break;

            case 3:
                if (GameData.currentHero.equipmentSet.contains("Knife")) {
                    System.out.println("You already have Knife");
                } else {
                    if (GameData.currentHero.coins >= 40) {
                        GameData.currentHero.equipmentSet.add("Knife");
                        GameData.currentHero.coins -= 40;
                        System.out.println("You bought Knife. Now you have " + GameData.currentHero.coins + "coins.");
                        System.out.println("Your weapon is: " + GameData.currentHero.equipmentSet);
                    } else {
                        System.out.println("You don't have enough money to buy Knife");
                    }
                }
                break;
            case 4:
                if (GameData.currentHero.equipmentSet.contains("Gun")) {
                    System.out.println("You already have Gun");
                } else {
                    if (GameData.currentHero.coins >= 50) {
                        GameData.currentHero.equipmentSet.add("Gun");
                        GameData.currentHero.coins -= 50;
                        System.out.println("You bought Gun. Now you have " + GameData.currentHero.coins + "coins.");
                        System.out.println("Your weapon is: " + GameData.currentHero.equipmentSet);
                    } else {
                        System.out.println("You don't have enough money to buy Gun");
                    }
                }
                break;
            case 5:
                if (GameData.currentHero.equipmentSet.contains("Potion")) {
                    System.out.println("You already have Potion");
                } else {
                    if (GameData.currentHero.coins >= 30) {
                        GameData.currentHero.equipmentSet.add("Potion");
                        GameData.currentHero.coins -= 30;
                        System.out.println("You bought Potion. Now you have " + GameData.currentHero.coins + "coins.");
                        System.out.println("Your weapon is: " + GameData.currentHero.equipmentSet);
                    } else {
                        System.out.println("You don't have enough money to buy Potion");
                    }
                }
                break;
            default:
                InstructionHelper.printShopEquipment();
        }
        Game.shop();
    }
}
