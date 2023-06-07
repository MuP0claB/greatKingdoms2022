package game;

public enum SuperAbility {
    HYPER_VENTILATION(1, 10), THUNDER_BOLT(1, 10), GETTING_INVISIBLE(1, 10);
    private int level;
    private int increasePoints;


    SuperAbility(int level, int increasePoints) {
        this.level = level;
        this.increasePoints = increasePoints;

    }

    public void increaseAbility() {
        switch (GameData.currentHero.ability) {
            case HYPER_VENTILATION:
                levelUp("hp", "Your current HP is ");
                break;
            case THUNDER_BOLT:
                levelUp("attack", "Your current defense is ");
                break;
            case GETTING_INVISIBLE:
                levelUp("defence", "Your current attack is ");
                break;
        }
    }

    private void levelUp(String statsToIncrease, String message) {
        if (this.level < 3) {
            this.level++;
            switch (statsToIncrease) {
                case "hp":
                    GameData.currentHero.healthPoints += 20;
                    System.out.println(message + GameData.currentHero.healthPoints);
                    break;
                case "attack":
                    GameData.currentHero.attack += 20;
                    System.out.println(message + GameData.currentHero.attack);
                    break;
                case "defence":
                    GameData.currentHero.defence += 20;
                    System.out.println(message + GameData.currentHero.defence);
                    break;
            }
            System.out.println("Your super ability level is: " + this.level);
            System.out.println("\033[31m< - > < - > < - > < - >\033[0m");
        } else {
            System.out.println("You already reached the maximum level of the ability");
        }
    }
}
