import java.util.ArrayList;

public class marks {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(85);
        list.add(92);
        list.add(78);
        list.add(90);
        list.add(65);
        list.add(88);
        list.add(76);

        System.out.println("Marks of all students: " + list);

        maximum(list);
        minimum(list);
        average(list);
    }

    // Method to find maximum marks
    static void maximum(ArrayList<Integer> list) {

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        System.out.println("Maximum marks of all students: " + max);
    }

    // Method to find minimum marks
    static void minimum(ArrayList<Integer> list) {

        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        System.out.println("Minimum marks of all students: " + min);
    }

    // Method to find average marks
    static void average(ArrayList<Integer> list) {

        int sum = 0;

        for (int mark : list) {
            sum = sum + mark;
        }

        double avg = (double) sum / list.size();

        System.out.println("Average marks of all students: " + avg);
    }
}