import java.util.*;

public class Solution01_ProductArray{
    public int[] solve(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // Pass 1: Store the product of all elements to the LEFT of index i
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // Pass 2: Calculate product of all elements to the RIGHT
        // Multiply it with the left product already stored in res
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * rightProduct;
            rightProduct *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        Solution01_ProductArray solution = new Solution01_ProductArray();
        
        int[] input = {1, 2, 3, 4};
        int[] result = solution.solve(input);
        
        System.out.println("Output: " + Arrays.toString(result)); 
        // Expected: [24, 12, 8, 6]
    }
}
