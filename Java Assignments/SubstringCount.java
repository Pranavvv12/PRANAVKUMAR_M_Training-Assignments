public class SubstringCount {
    public static void main(String[] args) {
        String str = "banana";
        String sub = "an";

        int count = 0;
        int index = 0;

        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length(); 
        }

        System.out.println("Occurrences of '" + sub + "': " + count);
    }
}
