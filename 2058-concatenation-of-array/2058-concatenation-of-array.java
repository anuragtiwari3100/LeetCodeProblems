class Solution {
    public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int resArr[] = new int[2*n];

            for(int i=0; i<n; i++){
                resArr[i] = nums[i];
                resArr[n+i] = nums[i];
            }

            return  resArr;
    }
}