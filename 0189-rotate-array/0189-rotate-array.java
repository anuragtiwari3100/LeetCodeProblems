class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
         int tempArr[] = new int[n];
         for(int i=0; i<nums.length; i++){
            tempArr[(i+k)%n] = nums[i];
         }
         for(int i=0; i<tempArr.length; i++){
            nums[i] = tempArr[i];
         }
    }
}