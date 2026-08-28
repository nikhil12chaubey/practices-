public class bag {
    public class backtracking {

    static String[] items = { "dal ", "chawal ", "roti " };
    static int[]  weights  = { 150, 240, 30 };
    static int weights Limit = 200;

    static void combineFoodCal(int index, String currentPlate, int currentweights) {

        // Stop if calories exceed the limit
        if (currentweights > caloriesLimit) {
            return;
        }

        // All food items checked
        if (index == food.length) {

            if (!currentPlate.isEmpty()) {
                System.out.println(currentPlate + "Total: "
                        + currentweights + " calories");
            }

            return;
        }

        // TAKE the current food
        combineFoodCal(
                index + 1,
                currentPlate + food[index],
                currentweights + calories[index]);

        // DON'T TAKE the current food (backtracking)
        combineFoodCal(
                index + 1,
                currentPlate,
                currentweights);
    }

    public static void main(String[] args) {

        System.out.println(
                "Possible Buffet Combinations under "
                        + caloriesLimit + " calories");

        combineFoodCal(0, "", 0);
    }
}

}
