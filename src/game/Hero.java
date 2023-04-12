package game;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public enum Hero {


    MOUNTAIN_HERO("Marko The Great", 100, SuperAbility.HYPER_VENTILATION, Location.THE_MOUNTAIN_PARADISE, 100, new HashSet<>()),

    SEA_HERO("Marin The Boss", 100, SuperAbility.CATCH_THOUGHTS, Location.THE_FLOATING_ISLAND, 100, new HashSet<>()),

    LA_AREA_HERO("Mad Max", 100, SuperAbility.CATCH_THOUGHTS, Location.THE_FLOATING_ISLAND, 100, new HashSet<>());

    public final String name;
    public int healthPoints;
    public final SuperAbility ability;
    public Set<String> equipmentSet = new HashSet<>(); //избираме сет за да спестим проверката (имаме право само по 1)
    public final Location location;
    public int coins;
    public static Map<Integer, Hero> heroChoise = new HashMap<Integer, Hero>() {{
        put(1, MOUNTAIN_HERO);
        put(2, SEA_HERO);
        put(3, LA_AREA_HERO);
    }};

    private Hero(String name, int healthPoints, SuperAbility ability, Location location, int coins, Set<String> equipmentSet) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.ability = ability;
        this.location = location;
        this.coins = coins;
        this.equipmentSet = equipmentSet;
    }

    public Resources getResource() {
        return location.getResource();
    }
}
