package viikko1;

public class ArrayStats {
    public static double average(int[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return (double) sum / arr.length;
    }

    public static int max(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int biggest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > biggest) {
                biggest = arr[i];
            }
        }
        return biggest;
    }
}
