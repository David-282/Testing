import java.util.Arrays;
import java.util.List;
import java.util.stream.Gatherer;

public class MyTest {

    static void main() {
//        String
//        String
//        StringBuffer
//        StringBuilder
//        List<Integer> number;
//        number = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        int i = number.get(3);


        System.out.print(passwordValidator("qqwertyugd1A&"));
    }


    public static boolean passwordValidator(String password) {
        if (password == null) return false;

        int length = password.length();
        if (length < 8 || length > 26) {
            return false;
        }

        String specialCharacters = "@-_.#$&*";
        boolean hasSpecial = false;
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (char letter : password.toCharArray()) {
            if (specialCharacters.contains(String.valueOf(letter))) hasSpecial = true;
            if (Character.isUpperCase(letter)) hasUpper = true;
            if (Character.isLowerCase(letter)) hasLower = true;
            if (Character.isDigit(letter)) hasDigit = true;
        }

        return hasSpecial && hasUpper && hasLower && hasDigit;
    }

    public static boolean isPasswordValid(String password){
        String regex ="(\\w+[!@_\\-*&#$%/]+){8,26}";

        return password.matches(regex);
    }
}