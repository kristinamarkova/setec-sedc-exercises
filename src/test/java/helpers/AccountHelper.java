package helpers;

import java.util.Random;

public class AccountHelper {
    private static final String[] firstNames = { "John", "Joanna", "Christina", "Peter", "Robert"};
    private static final String[] lastNames = { "Doe", "Smith", "Jones", "Williams", "Brown"};
    private static final String saltChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    public static String getRandomEmail(){
            StringBuilder emailBuilder = new StringBuilder();
            Random random = new Random();

            while (emailBuilder.length() < 10) { // length of the random string.
                int index = random.nextInt(saltChars.length());
                char letter = saltChars.charAt(index);
                emailBuilder.append(letter);
            }

            emailBuilder.append("@gmail.com");
            return emailBuilder.toString();
    }

    public static String getRandomFirstName(){
        Random random = new Random();
        int index = random.nextInt(firstNames.length);
        return firstNames[index];
    }

    public static String getRandomLastName(){
        Random random = new Random();
        int index = random.nextInt(lastNames.length);
        return lastNames[index];
    }
}
