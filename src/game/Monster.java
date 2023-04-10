package game;

public enum Monster {
    DESERT_MONSTER("Sphinx", 100),
    MOUNTAIN_MONSTER ("Sasquatch", 100),
    SEA_MONSTER("Dagon", 100);

    private final String name;
    private int monsterPoints;

    Monster(String name, int monsterPoints) {
        this.name = name;
        this.monsterPoints = monsterPoints;
    }

    public int getMonsterPoints() {
        return monsterPoints;
    }

    public String getName() {
        return name;
    }
}
