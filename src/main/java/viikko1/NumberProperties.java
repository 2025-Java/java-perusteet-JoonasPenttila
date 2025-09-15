package viikko1;

public class NumberProperties {
    public static String describe(int n) {
        if (n == 0) {
            return "nolla";
        }
        if (n > 0) {
            if (n % 2 == 0) {
                return "positiivinen parillinen";
            } else {
                return "positiivinen pariton";
            }
        } else { // n < 0
            if (n % 2 == 0) {
                return "negatiivinen parillinen";
            } else {
                return "negatiivinen pariton";
            }
        }
    }
}
