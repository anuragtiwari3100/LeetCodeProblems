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
    // }


 int maxEle = Integer.MIN_VALUE;
    int minEle = Integer.MAX_VALUE;
    
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > maxEle) {
            maxEle = arr[i];
        }
        if (arr[i] < minEle) {
            minEle = arr[i];
        }
    }
    
    // Calculate offset to handle negative indices
    int offset = Math.abs(minEle);
    
    // Create a hash array large enough to handle all elements
    int[] hashArr = new int[maxEle + offset + 1];  // Includes offset for negative values
    
    // Count occurrences
    for (int i = 0; i < arr.length; i++) {
        hashArr[arr[i] + offset]++;  // Adjust index by offset
    }
    
    // Find the element that occurs once
    for (int j = 0; j < hashArr.length; j++) {
        if (hashArr[j] == 1) {
            return j - offset;  // Adjust back to the original value
        }
    }
    
    return -1;







    }





}