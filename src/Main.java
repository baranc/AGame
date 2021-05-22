import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer, Place> places = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        places.put(0, new Place(0, "You are in yours mom basement"));
        places.put(1, new Place(1, "You are in front of home"));
        places.put(2, new Place(2, "You are opposite to hospital"));
        places.put(3, new Place(3, "You are beside of church"));
        places.put(4, new Place(4, "You are at the end of road"));

        places.get(1).addExit("N", 4);
        places.get(1).addExit("E", 3);
        places.get(1).addExit("S", 2);
        places.get(1).addExit("Q", 0);

        places.get(2).addExit("N", 1);
        places.get(2).addExit("Q",0);

        places.get(3).addExit("W", 1);
        places.get(3).addExit("Q", 0);

        places.get(4).addExit("S", 1);
        places.get(4).addExit("Q", 0);

        int place = 1;
        while (true){
            System.out.println(places.get(place).getDescription());
            if(place == 0){
                break;
            }

            Map<String, Integer> exits = places.get(place).getExits();
            System.out.println("Exits are ");
            for (String key: exits.keySet()) {
                System.out.print(key +", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();
            if(exits.containsKey(direction)){
                place = exits.get(direction);
            }else{
                System.out.println("you cannot go in this direction");
            }

            //place = scanner.nextInt();
            if(!places.containsKey(place)){
                System.out.println("you cannot go in this direction");
            }
        }
    }
}
