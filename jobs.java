import java.util.*;

public class Jobs {

    char id;
    int deadline;
    int profit;

    // Constructor
    Jobs(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }

    public static void findJobSequence(Jobs[] jobs) {

        int n = jobs.length;

        // Find maximum deadline
        int maxDeadline = 0;

        for (int i = 0; i < n; i++) {
            if (jobs[i].deadline > maxDeadline) {
                maxDeadline = jobs[i].deadline;
            }
        }

        System.out.println("Maximum Deadline: " + maxDeadline);

        // Sort jobs according to profit (descending)
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        // Array to store job sequence
        Jobs[] sequence = new Jobs[maxDeadline];

        // Store jobs
        for (int i = 0; i < n; i++) {

            // Start from the latest possible slot
            for (int j = jobs[i].deadline - 1; j >= 0; j--) {

                if (sequence[j] == null) {
                    sequence[j] = jobs[i];
                    break;
                }
            }
        }

        // Print sequence
        System.out.println("Job Sequence:");

        for (int i = 0; i < maxDeadline; i++) {
            if (sequence[i] != null) {
                System.out.print(sequence[i].id + " ");
            }
        }
    }

    public static void main(String[] args) {

        Jobs[] jobs = {
                new Jobs('A', 2, 100),
                new Jobs('B', 1, 19),
                new Jobs('C', 2, 27),
                new Jobs('D', 1, 25),
                new Jobs('E', 3, 15)
        };

        findJobSequence(jobs);
    }
}