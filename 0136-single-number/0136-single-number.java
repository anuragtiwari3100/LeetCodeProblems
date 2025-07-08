class Solution {


    public int singleNumber(int[] arr) {

    //   for(int i=0; i<nums.length; i++){
    //     int num = nums[i];
    //     int count = 0;
    //      for(int j=0; j<nums.length; j++){
    //         if(nums[j] == num){
    //             count ++;
    //         }
    //      }
    //      if(count == 1){
    //        return nums[i];
    //      }
    //   }  
    //   return -1;   


    // int xor =0;
    // for(int i=0; i<arr.length; i++){
    //     xor = xor^arr[i];
    // }
    // return xor;  

   int xor =0;
   for(int i=0; i<arr.length; i++){
    xor ^= arr[i];
   }
    return xor;
    }

}