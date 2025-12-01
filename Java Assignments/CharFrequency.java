public class CharFrequency {
    public static void main(String[] args) {
        String str = "programming";
        char ch = 'g';
        int count = 0;

        for (char c : str.toCharArray()) {
            if (c == ch) count++;
        }

        System.out.println("Frequency of '" + ch + "' is: " + count);
    }
}
