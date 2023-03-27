package game;

public enum Resources {
    WOOD(10), FISH(10), SCORPIO(10);

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
