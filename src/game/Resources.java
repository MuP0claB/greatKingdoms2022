package game;

public enum Resources {
    WOOD(0), FISH(0), SCORPIO(0);

    private int quantity;

    private Resources(int quantity){
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
