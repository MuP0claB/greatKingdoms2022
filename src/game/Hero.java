package game;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public enum Hero {


    MOUNTAIN_HERO_MALE("Marko The Great",110,SuperAbility.HYPER_VENTILATION, Location.THE_MOUNTAIN_PARADISE,100, new HashSet<>()),

    MOUNTAIN_HERO_FEMALE("Jeana D'Arc",95,SuperAbility.HYPER_VENTILATION, Location.THE_MOUNTAIN_PARADISE,100, new HashSet<>()),

    SEA_HERO_MALE("Marin The Boss",123,SuperAbility.CATCH_THOUGHTS, Location.THE_FLOATING_ISLAND,100, new HashSet<>()),

    SEA_HERO_FEMALE("Arielle Little Mermaid",101,SuperAbility.CATCH_THOUGHTS, Location.THE_FLOATING_ISLAND, 100, new HashSet<>());

    public final String name;
    public  int healthPoints;
    public final SuperAbility ability;
    public  Set<String> equipmentSet = new HashSet<>(); //избираме сет за да спестим проверката (имаме право само по 1)
    public final Location location;
    public int coins;
    public static Map<Integer, Hero> heroChoise = new HashMap<Integer, Hero>()

    {{
    put(1, MOUNTAIN_HERO_MALE);
    put(2, MOUNTAIN_HERO_FEMALE);
    put(3, SEA_HERO_MALE);
    put(4, SEA_HERO_FEMALE);
        }};

    private Hero(String name, int healthPoints, SuperAbility ability, Location location, int coins, Set <String> equipmentSet ) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.ability = ability;
        this.location = location;
        this.coins = coins;
        this.equipmentSet = equipmentSet;
    }

    public static void printMountainHeroInfo() {
        System.out.println(MOUNTAIN_HERO_MALE.name + ", has " + MOUNTAIN_HERO_MALE.healthPoints + " HP, and his super ability is " + MOUNTAIN_HERO_MALE.ability + ".");
        System.out.println(MOUNTAIN_HERO_FEMALE.name + ", has " + MOUNTAIN_HERO_FEMALE.healthPoints + " HP, and her super ability is " + MOUNTAIN_HERO_FEMALE.ability + ".");
    }

    public static void printSeaHeroInfo() {
        System.out.println(SEA_HERO_MALE.name + ", has " + SEA_HERO_MALE.healthPoints + " HP, and his super ability is " + SEA_HERO_MALE.ability + ".");
        System.out.println(SEA_HERO_FEMALE.name + ", has " + SEA_HERO_FEMALE.healthPoints + " HP, and her super ability is " + SEA_HERO_FEMALE.ability + ".");
    }
    public Resources getResource(){
        return location.getResource();
    }
    }
