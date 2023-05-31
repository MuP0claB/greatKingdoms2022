package game;

import game.monsters.Dagon;
import game.monsters.Monster;
import game.monsters.Sasquatch;
import game.monsters.Sphinx;

public enum Location {
    THE_MOUNTAIN_PARADISE(Resources.WOOD, PrincessName.LOLA_FERRARI, new Sasquatch()),
    LA_AREA_EMPIRE(Resources.SCORPIO, PrincessName.VICTORIA, new Sphinx()),
    THE_FLOATING_ISLAND(Resources.FISH, PrincessName.MELISSA, new Dagon());

    private final Resources resource;
    private final PrincessName princessName;

    private final Monster monster;


    private Location(Resources resource, PrincessName princessName, Monster monster) {
        this.resource = resource;
        this.princessName = princessName;
        this.monster = monster;
    }

    public Resources getResource() {
        return resource;
    }

    public PrincessName getPrincessName() {
        return princessName;
    }

    public Monster getMonster() {
        return monster;
    }
}
