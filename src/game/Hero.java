package game;

public enum Hero {
   MOUNTAIN_HERO_1("Marko The Great", 110),
   MOUNTAIN_HERO_2("Jeana D'Arc", 95);
    public final String name;
    public final int healthPoints;

    private Hero(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }
}
