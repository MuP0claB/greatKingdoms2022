package game;

public enum MonsterFirstEdition {
    DESERT_MONSTER("Sphinx", 100),
    MOUNTAIN_MONSTER ("game.Sasquatch", 100),
    SEA_MONSTER("Dagon", 100);

    private final String name;
    private int monsterPoints;

    MonsterFirstEdition(String name, int monsterPoints) {
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
