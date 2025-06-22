class Solution {
    public int maxSubArray(int[] arr) {
         
 
      int maxSum =Integer.MIN_VALUE;
      int  curr =0;
      for(int i=0; i<arr.length; i++){
      curr += arr[i];
          if(curr <0){
            curr =0;
          } 
        maxSum = Math.max(curr,maxSum);
      }
      return  maxSum;
    
    }
}