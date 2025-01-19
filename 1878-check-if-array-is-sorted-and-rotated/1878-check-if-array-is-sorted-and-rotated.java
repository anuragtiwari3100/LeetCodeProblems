class Solution {
    public boolean check(int[] nums) {

      boolean allsame = true;
      for(int i=1; i<nums.length; i++){
        if(nums[i-1] != nums[i]){
            allsame = false;
        }
      }
    //    if(allsame){
    //     return  true;
    //    }




          int n = nums.length;
          int count =  0;
           for(int i=1; i<nums.length; i++){
              if(nums[i-1] > nums[i]){
                count ++;
              }
           }
           if(nums[n-1] > nums[0]){
            count ++;
           }
        //    return count == 1;
           return allsame ? true : count ==1;
    }
}