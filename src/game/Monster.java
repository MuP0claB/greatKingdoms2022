package game;

public enum Monster {
    DESERT_MONSTER("Sphinx", 100),
    MOUNTAIN_MONSTER ("Sasquatch", 100),
    SEA_MONSTER("Dagon", 100);

    public final String name;
    public int monsterPoints;

    Monster(String name, int monsterPoints) {
        this.name = name;
        this.monsterPoints = monsterPoints;
    }
}
