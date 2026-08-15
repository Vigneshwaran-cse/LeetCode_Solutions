class Solution {
    public int pivotIndex(int[] nums) {
        int total_sum = 0;

        // Step 1: calculate total sum of array
        for (int p = 0; p < nums.length; p++) {
            total_sum += nums[p];
        }

        int left_sum = 0;

        // Step 2: check each index
        for (int i = 0; i < nums.length; i++) {
            int right_sum = total_sum - left_sum - nums[i]; // everything after i
            if (left_sum == right_sum) {
                return i; // found pivot
            }
            left_sum += nums[i]; // move pivot forward
        }

        return -1; // no pivot found
    }
}
