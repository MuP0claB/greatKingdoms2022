package game;

public enum SuperAbility {
    HYPER_VENTILATION(1, 20),
    CATCH_THOUGHTS(1, 10),
    GETTING_INVISIBLE(1, 15);
    private int level;
    private int increasePoints;


    SuperAbility(int level, int increasePoints) {
        this.level = level;
        this.increasePoints = increasePoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getIncreasePoints() {
        return increasePoints;
    }

    public void setIncreasePoints(int increasePoints) {
        this.increasePoints = increasePoints;
    }

    public void increaseAbility() {
        if (this.level < 3) {
            this.level++;
            this.increasePoints +=10;
        } else {
            System.out.println("You already reached the maximum level of the ability");
        }

    }
}
