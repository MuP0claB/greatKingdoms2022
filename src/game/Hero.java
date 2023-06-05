package game;

import game.monsters.Dagon;
import game.monsters.Monster;
import game.monsters.Sasquatch;
import game.monsters.Sphinx;

import java.util.*;

public enum Hero {


    MOUNTAIN_HERO("Marko The Great", 120, SuperAbility.HYPER_VENTILATION, Location.THE_MOUNTAIN_PARADISE, 100, new HashSet<>(), 0, 0),

    SEA_HERO("Triton The Brave", 100, SuperAbility.THUNDER_BOLT, Location.THE_FLOATING_ISLAND, 100, new HashSet<>(), 0, 20),

    LA_AREA_HERO("Mad Max", 100, SuperAbility.GETTING_INVISIBLE, Location.LA_AREA_EMPIRE, 100, new HashSet<>(), 20, 0);

    public final String name;
    public int healthPoints;
    public final SuperAbility ability;
    public Set<String> equipmentSet;
    public final Location location;
    public int coins;
    public int defence;
    public int attack;

    public Map<String, Boolean> heroMapPieces = new LinkedHashMap<>() {{
        put("Meet the Wizard", false);    //   Да се оставят на "true" при ТЕСТ на Битката с чудовището
        put("Guess the number", true);   //   Да се оставят на "true" при ТЕСТ на Битката с чудовището
    }};

    public static Map<Integer, Hero> heroChoise = new HashMap<>() {{
        put(1, MOUNTAIN_HERO);
        put(2, SEA_HERO);
        put(3, LA_AREA_HERO);
    }};

    private Hero(String name, int healthPoints, SuperAbility ability, Location location, int coins, Set<String> equipmentSet, int defence, int attack) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.ability = ability;
        this.location = location;
        this.coins = coins;
        this.equipmentSet = equipmentSet;
        this.defence = defence;
        this.attack = attack;
    }

    public Resources getResourceByCurrentHero() {
        return location.getResource();
    }
}
