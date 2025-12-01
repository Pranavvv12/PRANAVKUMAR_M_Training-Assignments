public class CountWords {
    public static void main(String[] args) {
        String str = "Java is awesome";
        String[] words = str.trim().split("\\s+");

        System.out.println("Number of words: " + words.length);
    }
}
