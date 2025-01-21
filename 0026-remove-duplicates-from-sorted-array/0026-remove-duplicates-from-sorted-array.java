class Solution {
    public int removeDuplicates(int[] nums) {
            /**
              //Approach.1
                            Set<Integer> set = new LinkedHashSet<>();

                for(int i=0; i<nums.length; i++){
                    set.add(nums[i]);
                }
                int k= set.size();
                int idx =0;
                for(int x :set){
                    nums[idx] =x;
                    idx++;
                }
                return k ; 
            */

            //Aproach.2
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}