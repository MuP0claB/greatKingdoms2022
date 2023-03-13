package game;

public class GameLocationSettings {
    private String locationName;
    private String climate;
    private GameStoryLocation location;

    private String resources;
    private String monsterName;
    private String princessName;

    public GameLocationSettings(String locationName, String climate, GameStoryLocation location, String resources, String monsterName, String princessName) {
        this.locationName = locationName;
        this.climate = climate;
        this.location = location;
        this.resources = resources;
        this.monsterName = monsterName;
        this.princessName = princessName;
    }


}
