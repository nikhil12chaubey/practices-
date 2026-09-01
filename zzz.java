import java.util.*;

public class zzz {
    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -15, 30, 16 };
        int k = 3;
        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            if (!dq.isEmpty() && dq.peekFirst() <= i - k)
                dq.pollFirst();
            if (arr[i] < 0)
                dq.offerLast(i);
            if (i >= k - 1)
                System.out.print(dq.isEmpty() ? "0 " : arr[dq.peekFirst()] + " ");
        }
    }
}