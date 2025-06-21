class Solution {

   /*
          public int[] productExceptSelf(int[] nums) {
   int  n =  nums.length;
   int  ansArr[] = new int[n];
   for(int i=0; i<n; i++){
    int product =1;
    for(int j=0; j<n; j++){
        if(i != j){ 
            product *= nums[j];
        }
    }
    ansArr[i] = product;
   }
   return ansArr;  
    }
    */


    /**
    public int[] productExceptSelf(int[] nums) {
         int n = nums.length;
         int  prefixArr[] = new int[n];
         int  suffixArr[] = new int[n];
         int  ansArr[] = new int[n];
         Arrays.fill(prefixArr,1);
         Arrays.fill(suffixArr,1);

         //Step1. Calculate Prefix
         for(int i=1; i<n; i++){
           prefixArr[i] = prefixArr[i-1]* nums[i-1];
         }

         //Step2 Calcualte Suffix
         for(int i=n-2; i>=0; i--){
          suffixArr[i] = suffixArr[i+1] * nums[i+1];
         }
         
         for(int j=0; j<n; j++){
            ansArr[j] = prefixArr[j]*suffixArr[j];
         }
       
       return ansArr;
    }
     */




  public int[] productExceptSelf(int[] nums) {
 int n = nums.length;
        
         int  ansArr[] = new int[n];

         // Fix: Initialize first element to 1
         ansArr[0] = 1;

         //Step1. Calculate Prefix
         for(int i=1; i<n; i++){
           ansArr[i] = ansArr[i-1]* nums[i-1];
         }


         //Step2. Calculate Suffix
         int suffix =1;
         for(int i=n-2; i>=0; i--){
          suffix *= nums[i+1];
          ansArr[i] *= suffix;
  }
  return ansArr;
}
}