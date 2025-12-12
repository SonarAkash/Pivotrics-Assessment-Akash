public class Solution07_JumpGame {

    private Integer[] dp;
    private static final int MAX = Integer.MAX_VALUE / 2;

    public int solve(int[] nums) {
        int n = nums.length;
        dp = new Integer[n];

        int ans = rec(0, nums, n);

        // If no valid path exists
        return ans >= MAX ? -1 : ans;
    }

    private int rec(int idx, int[] nums, int n) {

        // Out of bounds means this jump path is not valid
        if (idx >= n) return MAX;

        // Reached the last index, no more jumps needed
        if (idx == n - 1) return 0;

        // Return memoized result
        if (dp[idx] != null) return dp[idx];

        int best = MAX;

        // Try all reachable next positions
        for (int step = 1; step <= nums[idx]; step++) {
            best = Math.min(best, rec(idx + step, nums, n) + 1);
        }

        return dp[idx] = best;
    }

    public static void main(String[] args) {
        Solution07_JumpGame solution = new Solution07_JumpGame();
        System.out.println(solution.solve(new int[]{2,4,1,1,1,1})); // 2
        System.out.println(solution.solve(new int[]{2,1,2,1,0}));   // 2
    }
}
