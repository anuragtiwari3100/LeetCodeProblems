class Solution {
    public int maxSubArray(int[] arr) {
        int currSum =0;
        int maxSum =Integer.MIN_VALUE;
        boolean hasPositive = false;
        int maxNegativeSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
             if(arr[i]>0){
              hasPositive = true;
             }
            if(hasPositive){
              currSum = currSum+arr[i];
              if(currSum < 0){
                currSum = 0;
              }  
              maxSum = Math.max(currSum,maxSum);
            }
            if(!hasPositive){
              maxNegativeSum = Math.max(maxNegativeSum,arr[i]);
            }
        }
        return hasPositive ? maxSum :maxNegativeSum;
    }
}