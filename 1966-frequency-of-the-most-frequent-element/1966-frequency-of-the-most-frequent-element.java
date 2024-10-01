

public class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);

        int left = 0, ans = 0; 
        long sum = 0; // Use long to prevent overflow

        // Sliding window
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            // Check if the current window is valid
            while ((right - left + 1) * (long) nums[right] > sum + k) {
                sum -= nums[left];
                left++;
            }

            // Update the maximum frequency found so far
            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}
