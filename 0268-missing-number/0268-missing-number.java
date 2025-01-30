class Solution {
    public int missingNumber(int[] nums) {
       int  N = nums.length+1;
       for(int i=0; i<=N; i++){
        int flag =0;
        for(int j=0; j<nums.length; j++){
            if(nums[j] == i){
                flag =1;
                break;
            }
        }
        if(flag == 0){
           return i; 
        }
       }
       return -1;
    }
}
