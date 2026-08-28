import java.util.Random;
import java.util.Scanner;

class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Guess the number (1-100). You have 7 tries.");

        int target = rand.nextInt(100) + 1;
        int tries = 7;

        while (tries > 0) {
            System.out.print("\nTries left " + tries + ", guess: ");
            int guess = sc.nextInt();
            tries--;

            if (guess == target) {
                System.out.println("Correct! You win.");
                sc.close();
                return;
            } else if (guess < target) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high.");
            }
        }

        System.out.println("Out of tries. The number was " + target);
        sc.close();
    }
}