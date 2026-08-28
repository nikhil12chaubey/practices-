public class pyramid {
    public static void main(String[] args) {
        int rows = 5;

        // Print pyramid
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("-o-o-o-o-");
            }
            System.out.println();
        }
    }
}