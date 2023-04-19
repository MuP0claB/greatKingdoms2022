package game;

public enum SuperAbility {
    HYPER_VENTILATION(1, 20),
    THUNDER_BOLT(1, 20),
    GETTING_INVISIBLE(1, 20);
    private int level;
    private int increasePoints;
  private String name;

    SuperAbility () {}
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
        GameData.currentHero.healthPoints += this.increasePoints;
    }

    public void increaseAbility() {
        if (GameData.currentHero.ability.equals(HYPER_VENTILATION)) {
            if (this.level < 3) {
                this.level++;
                GameData.currentHero.healthPoints += 20;
                System.out.println("Your HP is now " + GameData.currentHero.healthPoints);
            } else {
                System.out.println("You already reached the maximum level of the ability");
            }
        } else if (GameData.currentHero.ability.equals(THUNDER_BOLT)) {
            if (this.level < 3) {
                this.level++;
                GameData.currentHero.defense += 20;
            } else {
                System.out.println("You already reached the maximum level of the ability");
            }
        } else if (GameData.currentHero.ability.equals(GETTING_INVISIBLE)) {
            if (this.level < 3) {
                this.level++;
                GameData.currentHero.attack += 20;
            } else {
                System.out.println("You already reached the maximum level of the ability");
            }
        }
    }
}
