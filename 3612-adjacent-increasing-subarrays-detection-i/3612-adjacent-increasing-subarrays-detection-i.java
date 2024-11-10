import java.util.List;

public class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();

        boolean[] isIncreasing = new boolean[n - k + 1];
        
        for (int i = 0; i <= n - k; i++) {
            boolean strictlyIncreasing = true;
            for (int j = i; j < i + k - 1; j++) {
                if (nums.get(j) >= nums.get(j + 1)) {
                    strictlyIncreasing = false;
                    break;
                }
            }
            isIncreasing[i] = strictlyIncreasing;
        }
        
        for (int i = 0; i <= n - 2 * k; i++) {
            if (isIncreasing[i] && isIncreasing[i + k]) {
                return true;
            }
        }
        
        return false;
    }
}
