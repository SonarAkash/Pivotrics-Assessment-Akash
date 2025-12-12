import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Solution03_TwoSum {

    public int[] solve(int[] nums, int target) {
        // stores value -> index
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // if we have already seen the needed number, return the pair
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // otherwise remember this number's index
            map.put(nums[i], i);
        }

        // no valid pair found
        return new int[] {};
    }

    public static void main(String[] args) {
        Solution03_TwoSum solution = new Solution03_TwoSum();

        // Test 1
        int[] nums1 = {3, 4, 5, 6};
        System.out.println("Test 1: " + Arrays.toString(solution.solve(nums1, 7)));
        // Expected: [0, 1]

        // Test 2
        int[] nums2 = {3, 2, 4};
        System.out.println("Test 2: " + Arrays.toString(solution.solve(nums2, 6)));
        // Expected: [1, 2]
    }
}
