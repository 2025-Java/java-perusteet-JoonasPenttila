package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        int x, y, z;

        // lajitellaan käsin ilman kirjastoja
        if (a <= b && a <= c) {
            x = a;
            if (b <= c) {
                y = b;
                z = c;
            } else {
                y = c;
                z = b;
            }
        } else if (b <= a && b <= c) {
            x = b;
            if (a <= c) {
                y = a;
                z = c;
            } else {
                y = c;
                z = a;
            }
        } else {
            x = c;
            if (a <= b) {
                y = a;
                z = b;
            } else {
                y = b;
                z = a;
            }
        }

        return x + "," + y + "," + z;
    }
}
