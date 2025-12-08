import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> vec = new Vector<>();
        vec.add("Apple");
        vec.add("Banana");
        vec.add("Cherry");
        vec.add(1, "Mango");

        System.out.println("Element at index 2: " + vec.get(2));

        vec.set(0, "Pineapple");

        vec.remove("Banana");
       
        System.out.println("Size: " + vec.size());
        System.out.println("Capacity: " + vec.capacity());
        System.out.println("Vector elements:");
        for (String s : vec) {
            System.out.println(s);
        }
    }
}
