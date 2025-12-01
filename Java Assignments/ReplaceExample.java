public class ReplaceExample {
    public static void main(String[] args) {
        String str = "Hello Java";
        
        String replacedChar = str.replace('a', '@');
        String replacedWord = str.replace("Java", "World");

        System.out.println("Char replaced: " + replacedChar);
        System.out.println("Word replaced: " + replacedWord);
    }
}
