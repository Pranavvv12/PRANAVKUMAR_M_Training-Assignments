import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40, 30};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int x : arr) {
            set.add(x);   
        }
        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int x : set) {
            uniqueArr[i++] = x;
        }

        System.out.println("Array after removing duplicates:");
        for (int x : uniqueArr) {
            System.out.print(x + " ");
        }
    }
}
