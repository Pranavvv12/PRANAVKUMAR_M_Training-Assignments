import java.util.HashMap;

public class frequency {
    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 10, 40};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println("Frequency of each element:");
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
    }
}
