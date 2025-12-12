import java.util.Collections;
import java.util.PriorityQueue;

public class Solution04_LastStoneWeight {

    public int solve(int[] stones) {
        // max-heap for always picking the largest stones
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.offer(stone);
        }

        // keep smashing the two largest stones
        while (pq.size() > 1) {
            int stone1 = pq.poll();
            int stone2 = pq.poll();

            // if one is heavier, the leftover goes back in
            if (stone1 > stone2) {
                pq.offer(stone1 - stone2);
            }
        }

        // return whatever is left (or 0)
        return pq.isEmpty() ? 0 : pq.poll();
    }

    public static void main(String[] args) {
        Solution04_LastStoneWeight solution = new Solution04_LastStoneWeight();

        // Test Case 1
        System.out.println(solution.solve(new int[]{2, 3, 6, 2, 4})); // Expected: 1

        // Test Case 2
        System.out.println(solution.solve(new int[]{1, 2})); // Expected: 0
    }
}
