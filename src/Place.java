import java.util.Map;

public class Place {
    private final int placeID;
    private final String description;
    private final Map<String, String> exits;

    public Place(int placeID, String description) {
        this.placeID = placeID;
        this.description = description;
    }
}
