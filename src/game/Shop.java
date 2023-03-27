package game;

public class Shop {
    public static int sellResource(Resources resource){
        resource.setQuantity(resource.getQuantity()-1);
        return 10;
    }

}
