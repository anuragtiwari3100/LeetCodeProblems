class Solution {
    public int longestConsecutive(int[] nums) {
   /**
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
         }

         largest  = Math.max(largest,count);
        } 
            return largest;
 */
    int  n =  nums.length;
    Set<Integer> set = new HashSet<>();
    int largest =1;
    if(n == 0){
         return 0;
    }
    for(int i =0; i<nums.length; i++){
      set.add(nums[i]);
    }
    for(int x:set){
        if(!set.contains(x-1)){
            int count =1;
            int num = x;
           while(set.contains(num+1)){
             count +=1;
             num +=1;
           }
          largest = Math.max(largest,count); 
        }
    }
  return largest;
    }
}