package game;

public class Shop {
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
        GameData.currentHero.equipmentSet.add("Shield");
        System.out.println("added shield");
        //GameData.currentHero.equipmentSet.add("Knife");

        //1. Armour - increase hero hp
        //2. Shield - increase hero hp
        //3. Potion - increase hp with 50%
        //4. Knife - increase
    }
}
