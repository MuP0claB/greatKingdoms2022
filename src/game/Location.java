package game;

public enum Location {
    THE_MOUNTAIN_PARADISE(Resources.WOOD), LA_AREA_EMPIRE(Resources.SCORPIO), THE_FLOATING_ISLAND(Resources.FISH);

    private final Resources resource;


    private Location(Resources resource){
        this.resource = resource;
    }

    public Resources getResource() {
        return resource;
    }
}
