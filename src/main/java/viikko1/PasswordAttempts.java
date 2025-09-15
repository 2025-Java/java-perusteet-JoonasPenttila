package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        String correct = "java123";
        int attempts = 0;

        while (attempts < 3 && attempts < tries.length) {
            if (tries[attempts].equals(correct)) {
                return "Tervetuloa!";
            }
            attempts++;
        }

        return "Liian monta virheellistä yritystä.";
    }
}
