package game;

import java.util.Map;

public abstract class Monster {
    private String name;
    private int monsterPoints;

    abstract void monsterFightChallenge();

    public Monster(String name, int monsterPoints) {
        this.name = name;
        this.monsterPoints = monsterPoints;
    }

    public boolean checkMapContent() {
        boolean isAvailable = false;

        for (Map.Entry<String, Boolean> entry : GameData.currentHero.heroMapPieces.entrySet()) {
            isAvailable = entry.getValue();
            if (!isAvailable) {
                break;
            }
        }
        return isAvailable;
    }
}
