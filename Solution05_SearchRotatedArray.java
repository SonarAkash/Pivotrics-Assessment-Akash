public class Solution05_SearchRotatedArray {

    public int solve(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // found the target
            if (nums[mid] == target) {
                return mid;
            }

            // check which side is sorted
            if (nums[left] <= nums[mid]) {
                // left half is sorted
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                // right half is sorted
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; 
                } else {
                    right = mid - 1; 
                }
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        Solution05_SearchRotatedArray s = new Solution05_SearchRotatedArray();

        System.out.println(s.solve(new int[]{3,4,5,6,1,2}, 1)); // 4
        System.out.println(s.solve(new int[]{3,5,6,0,1,2}, 4)); // -1
    }
}
