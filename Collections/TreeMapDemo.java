import java.util.Map;
import java.util.TreeMap;
import java.util.NavigableMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Three");
        map.put(1, "One");
        map.put(4, "Four");
        map.put(2, "Two");

        System.out.println("TreeMap in ascending order:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "  Value: " + entry.getValue());
        }
        NavigableMap<Integer, String> descMap = map.descendingMap();

        System.out.println("\nTreeMap in descending order:");
        for (Map.Entry<Integer, String> entry : descMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + "  Value: " + entry.getValue());
        }
    }
}
