import java.util.regex.*;

public class PhoneValidator {
    public static void main(String[] args) {
        String[] numbers = {
                "001-765-989-3421",
                "+1-456-765-9345",
                "456-777-999-2222"
        };
        String regex = "^(\\+\\d{1,3}|\\d{3})-\\d{3}-\\d{3}-\\d{4}$";
        Pattern pattern = Pattern.compile(regex);
        for (String number : numbers) {
            Matcher matcher = pattern.matcher(number);
            if (matcher.matches()) {
                System.out.println(number + " → Valid");
            } else {
                System.out.println(number + " → Invalid");
            }
        }
    }
}
