public class CountCharacters {
    public static void main(String[] args) {
        String str = "Hello123@$";

        int digits = 0, letters = 0, special = 0;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) digits++;
            else if (Character.isLetter(c)) letters++;
            else special++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }
}
