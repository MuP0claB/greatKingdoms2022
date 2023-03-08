package location;

public class Location {
    private final String descriptionOfLocation;
    private final String locationName;
    private final int attitude; //fight abilyties
    private final int climate; //fight abilyties
    private final String creatureName;
    private final String princessName;
    private final String resоurces;

    public String getLocationName() {
        return locationName;
    }

    public int getAttitude() {
        return attitude;
    }

    public int getClimate() {
        return climate;
    }

    public String getCreatureName() {
        return creatureName;
    }

    public String getPrincessName() {
        return princessName;
    }

    public String getResоurces() {
        return resоurces;
    }

    public Location(String descriptionOfLocation, String locationName, int attitude, int climate, String creatureName, String princessName, String resоurces) {
        this.descriptionOfLocation = descriptionOfLocation;
        this.locationName = locationName;
        this.attitude = attitude;
        this.climate = climate;
        this.creatureName = creatureName;
        this.princessName = princessName;
        this.resоurces = resоurces;
    }
}
/*
Планинси рай БУЛГАРЕ

Населява се от племето - Българи.

Характерно за племето е:

Населяват връх “Околчица”, който е ситуиран в околието на гр. Враца -  “Стара Планина” на огромна надморска височина  3563метра.

Поради тази причина, когато слизат от върха в долината те разполагат с 10% повече енергия, на вскеки 1000 метра по - ниска надморска височина.
Това се дължи на по-голямото насищане с кислордни атоми, а именно това допринася за техните суперсили “ХИПЕР ВЕНТИЛИРАНЕ” и  екслозивна енергия
на техните клетки и фибри.
 */