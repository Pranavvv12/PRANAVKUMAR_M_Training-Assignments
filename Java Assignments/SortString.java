import java.util.Arrays;

public class SortString {
    public static void main(String[] args) {
        String str = "java";
        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        System.out.println("Sorted characters: " + new String(arr));
    }
}
