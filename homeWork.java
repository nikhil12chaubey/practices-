import java.util.Arrays;

public class homeWork {
    public static void main(String[] args) {
        int[] arrival = { 900, 940, 950, 1100, 1500, 1800 };
        int[] departure = { 910, 1200, 1120, 1130, 1900, 2000 };
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int i = 0, j = 0;
        int platforms = 0, max = 0;
        while (i < arrival.length) {
            if (arrival[i] < departure[j]) {
                platforms++;
                i++;
                if (platforms > max)
                    max = platforms;
            } else {
                platforms--;
                j++;
            }
        }
        System.out.println("Minimum platforms: " + max);
    }
}
