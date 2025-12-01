public class LeftRotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = 2;

        int len = arr.length;
        n = n % len; 
        int[] rotated = new int[len];
        int j = 0;

        for (int i = n; i < len; i++) {
            rotated[j++] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            rotated[j++] = arr[i];
        }

        System.out.println("Array after left rotation by " + n + " positions:");
        for (int x : rotated) {
            System.out.print(x + " ");
        }
    }
}
