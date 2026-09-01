import java.util.Scanner;

public class lexico {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();
        int k = sc.nextInt();

        String smallest = S.substring(0, k);
        String largest = S.substring(0, k);

        for (int i = 1; i <= S.length() - k; i++) {

            String current = S.substring(i, i + k);

            if (current.compareTo(smallest) < 0) {
                smallest = current;
            }

            if (current.compareTo(largest) > 0) {
                largest = current;
            }
        }

        System.out.println(smallest);
        System.out.println(largest);

        sc.close();
    }
}