class Solution {
    public int removeDuplicates1(int[] nums) {
        
        int n = nums.length;
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int x : nums){
            set.add(x);
        }

        int i =0 ;
        for(int x : set){
         nums[i] = x;
           
            i++;
        }

  return i;
    }

        public int removeDuplicates(int[] nums) {
          int i =0;
          for(int j=1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                 i++;
               nums[i] = nums[j];  
            }
          }
          return i+1;
        }
}