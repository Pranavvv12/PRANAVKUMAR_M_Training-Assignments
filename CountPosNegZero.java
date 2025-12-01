public class CountPosNegZero {
    public static void main(String[] args) {
        int[] arr = {1, -3, 0, 5, -1, 0, 4};

        int pos = 0, neg = 0, zero = 0;

        for (int x : arr) {
            if (x > 0) pos++;
            else if (x < 0) neg++;
            else zero++;
        }

        System.out.println("Positive elements: " + pos);
        System.out.println("Negative elements: " + neg);
        System.out.println("Zero elements: " + zero);
    }
}
