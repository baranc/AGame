import java.util.HashMap;
import java.util.Map;

public class Place {
    private final int placeID;
    private final String description;
    private final Map<String, Integer> exits;

    public int getPlaceID() {
        return placeID;
    }

    public String getDescription() {
        return description;
    }


    public Place(int placeID, String description) {
        this.placeID = placeID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    public void addExit(String direction, int place){
        exits.put(direction, place);
    }

    public Map<String, Integer> getExits(){
        return new HashMap<>(exits);
    }
}
