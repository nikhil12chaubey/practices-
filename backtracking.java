public class backtracking {

    static String[] food = { "dal ", "chawal ", "roti " };
    static int[] calories = { 150, 240, 30 };
    static int caloriesLimit = 200;

    static void combineFoodCal(int index, String currentPlate, int currentCalories) {

        // Stop if calories exceed the limit
        if (currentCalories > caloriesLimit) {
            return;
        }

        // All food items checked
        if (index == food.length) {

            if (!currentPlate.isEmpty()) {
                System.out.println(currentPlate + "Total: "
                        + currentCalories + " calories");
            }

            return;
        }

        // TAKE the current food
        combineFoodCal(
                index + 1,
                currentPlate + food[index],
                currentCalories + calories[index]);

        // DON'T TAKE the current food (backtracking)
        combineFoodCal(
                index + 1,
                currentPlate,
                currentCalories);
    }

    public static void main(String[] args) {

        System.out.println(
                "Possible Buffet Combinations under "
                        + caloriesLimit + " calories");

        combineFoodCal(0, "", 0);
    }
}