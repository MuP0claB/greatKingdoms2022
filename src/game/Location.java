package game;

public enum Location {
    THE_MOUNTAIN_PARADISE(Resources.WOOD, MonsterFirstEdition.MOUNTAIN_MONSTER), LA_AREA_EMPIRE(Resources.SCORPIO,MonsterFirstEdition.DESERT_MONSTER), THE_FLOATING_ISLAND(Resources.FISH, MonsterFirstEdition.SEA_MONSTER);

    private final Resources resource;
    private final MonsterFirstEdition monster;


    private Location(Resources resource, MonsterFirstEdition monster){
        this.resource = resource;
        this.monster = monster;
    }

    public Resources getResource() {
        return resource;
    }

    public int getMonsterPoints() {
        return monster.getMonsterPoints();
    }
    public String getMonsterName(){ return monster.getName();}
}
