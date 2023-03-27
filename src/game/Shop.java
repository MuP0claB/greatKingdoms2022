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

}
