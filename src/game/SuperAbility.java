package game;

public enum SuperAbility {
    HYPER_VENTILATION(1, 20),
    THUNDER_BOLT(1, 20),
    GETTING_INVISIBLE(1, 20);
    private int level;
    private int increasePoints;

    SuperAbility() {
    }

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

    public void increaseAbility() {
        switch (GameData.currentHero.ability) {
            case HYPER_VENTILATION:
                if (this.level < 3) {
                    this.level++;
                    GameData.currentHero.healthPoints += increasePoints;
                    System.out.println("Your current HP is " + GameData.currentHero.healthPoints);
                } else {
                    System.out.println("You already reached the maximum level of the ability");
                }
                break;
            case THUNDER_BOLT:
                if (this.level < 3) {
                    this.level++;
                    GameData.currentHero.defense += increasePoints;
                    System.out.println("Your current defense is " + GameData.currentHero.defense);
                } else {
                    System.out.println("You already reached the maximum level of the ability");
                }
                break;
            case GETTING_INVISIBLE:
                if (this.level < 3) {
                    this.level++;
                    GameData.currentHero.attack += increasePoints;
                    System.out.println("Your current attack is " + GameData.currentHero.attack);
                } else {
                    System.out.println("You already reached the maximum level of the ability");
                }
                break;
        }

    }
}
