package game;

public enum Location {
    THE_MOUNTAIN_PARADISE(Resources.WOOD, Monster.MOUNTAIN_MONSTER), LA_AREA_EMPIRE(Resources.SCORPIO, Monster.DESERT_MONSTER), THE_FLOATING_ISLAND(Resources.FISH, Monster.SEA_MONSTER);

    private final Resources resource;
    private final Monster monster;


    private Location(Resources resource, Monster monster){
        this.resource = resource;
        this.monster = monster;
    }

    public Resources getResource() {
        return resource;
    }

    public int getMonsterPoints() {
        return monster.getMonsterPoints();
    }
}
