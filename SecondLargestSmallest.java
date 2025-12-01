public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20, 3};

        Integer largest = null, secondLargest = null;
        Integer smallest = null, secondSmallest = null;

        for (int x : arr) {
            if (largest == null || x > largest) {
                secondLargest = largest;
                largest = x;
            } else if (x != largest && (secondLargest == null || x > secondLargest)) {
                secondLargest = x;
            }

            if (smallest == null || x < smallest) {
                secondSmallest = smallest;
                smallest = x;
            } else if (x != smallest && (secondSmallest == null || x < secondSmallest)) {
                secondSmallest = x;
            }
        }

        if (secondLargest == null || secondSmallest == null) {
            System.out.println("Not enough distinct elements.");
        } else {
            System.out.println("Largest: " + largest);
            System.out.println("Second Largest: " + secondLargest);
            System.out.println("Smallest: " + smallest);
            System.out.println("Second Smallest: " + secondSmallest);
        }
    }
}
