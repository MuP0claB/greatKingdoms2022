package game;

public enum Hero {

    MOUNTAIN_HERO_MALE("Marko The Great", 110, SuperAbility.HYPER_VENTILATION),
    MOUNTAIN_HERO_FEMALE("Jeana D'Arc", 95, SuperAbility.HYPER_VENTILATION);
    public final String name;
    public final int healthPoints;

    public final SuperAbility ability;


    private Hero(String name, int healthPoints, SuperAbility ability) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.ability = ability;
    }

    public static void printHeroInfo() {
        System.out.println(MOUNTAIN_HERO_MALE.name + ", has " + MOUNTAIN_HERO_MALE.healthPoints + " HP, and his super ability is " + MOUNTAIN_HERO_MALE.ability + ".");
        System.out.println(MOUNTAIN_HERO_FEMALE.name + ", has " + MOUNTAIN_HERO_FEMALE.healthPoints + " HP, and her super ability is " + MOUNTAIN_HERO_FEMALE.ability + ".");

    }
}
