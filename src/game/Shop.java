package game;

import java.util.Scanner;

public class Shop {
    Scanner scanner = new Scanner(System.in);
    public static int sellResource(Resources resource){

        if (resource.getQuantity() > 0) {
            resource.setQuantity(resource.getQuantity()-1);
            System.out.println(resource.name().toLowerCase() + " successfully sold");
            return 10;
        } else {
            System.err.println("Not enough resources");
            return 0;
        }
    }

    public static void buyEquipment(){
        InstructionHelper.printShopEquipment();
        int menuChoice = scanner.nextInt();
        System.out.println("Please choose between 1 & 5 ");
        switch (menuChoice) {
            case 1:
                shop();
                break;
            case 2:
                checkInventory();
                break;
            case 3:
                takeResources();
                break;
            case 4:
                increaseYourSkills();
                break;
            case 5:
                chooseYourMission();
                break;
            default:
                mainMenu();
        }
        //GameData.currentHero.equipmentSet.add("Shield");
        System.out.println("added shield");
        System.out.println(GameData.currentHero.equipmentSet);
        //GameData.currentHero.equipmentSet.add("Knife");

        //1. Armour - increase hero hp
        //2. Shield - increase hero hp
        //3. Potion - increase hp with 50%
        //4. Knife - increase
    }
}
