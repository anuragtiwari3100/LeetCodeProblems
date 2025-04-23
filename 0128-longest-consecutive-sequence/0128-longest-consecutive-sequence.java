class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int lastSmallest =Integer.MIN_VALUE;
        int  count = 0;
        int largest = 0;
        for(int i=0; i<nums.length; i++){
         if(nums[i]-1 == lastSmallest){
            count +=1;
            lastSmallest = nums[i];
         }else if(nums[i] != lastSmallest){
           count = 1;
           lastSmallest = nums[i];
         }else{
            if(nums[i] == lastSmallest){
                continue;
            }
         }

         largest  = Math.max(largest,count);
        } 
            return largest;
  
    }
}