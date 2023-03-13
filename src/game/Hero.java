package game;

public enum Hero {
   MOUNTAIN_HERO_1("Marko The Great", 110, SuperAbility.HYPER_VENTILATION),
   MOUNTAIN_HERO_2("Jeana D'Arc", 95, SuperAbility.HYPER_VENTILATION);
    public final String name;
    public final int healthPoints;

    public final SuperAbility ability;

    private Hero(String name, int healthPoints, SuperAbility ability) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.ability = ability;
    }
}
