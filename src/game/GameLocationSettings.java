package game;

public class GameLocationSettings {
    private String locationName; //Kaloyan
    private String climate; //Vlady
    private GameStoryLocation location;

    private String resources; // Miro
    private String monsterName; // Miro
    private String princessName; //Kaloyan

    public GameLocationSettings(String locationName, String climate, GameStoryLocation location, String resources, String monsterName, String princessName) {
        this.locationName = locationName;
        this.climate = climate;
        this.location = location;
        this.resources = resources;
        this.monsterName = monsterName;
        this.princessName = princessName;
    }


}
