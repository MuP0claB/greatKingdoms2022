package game;

public enum SuperAbility {
    HYPER_VENTILATION(1, 10),
    THUNDER_BOLT(1, 10),
    GETTING_INVISIBLE(1, 10);
    private int level;
    private int increasePoints;


    SuperAbility(int level, int increasePoints) {
        this.level = level;
        this.increasePoints = increasePoints;

    }

    public void increaseAbility() {
        switch (GameData.currentHero.ability) {
            case HYPER_VENTILATION:
                levelUp(GameData.currentHero.healthPoints, "Your current HP is ");
                break;
            case THUNDER_BOLT:
                levelUp(GameData.currentHero.attack, "Your current defense is ");
                break;
            case GETTING_INVISIBLE:
                levelUp(GameData.currentHero.defence, "Your current attack is ");
                break;
        }
    }

    private void levelUp(int statsToIncrease, String message) {
        if (this.level < 3) {
            this.level++;
            statsToIncrease += increasePoints;
            System.out.println(message + statsToIncrease);
            System.out.println("Your super ability level is: " + this.level);
            System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
        } else {
            System.out.println("You already reached the maximum level of the ability");
        }
    }
}
