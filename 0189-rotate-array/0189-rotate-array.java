

class Solution {
/**
        //Apprach1
      public void rotate1(int[] nums, int k) {
        int n = nums.length;
         int tempArr[] = new int[n];
         for(int i=0; i<nums.length; i++){
            nums[(i+k)%n] = nums[i];
         }
         for(int i=0; i<tempArr.length; i++){
            nums[i] = tempArr[i];
         }
    }
 */

    //Appraoch2
    public void rev(int arr[], int si, int ei) {

/*
   
        for (int i = si, j = ei; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
 */
   while(si<=ei){
    int temp = arr[si];
      arr[si] = arr[ei];
      arr[ei] =temp;
      si++;
      ei--;
   }
    }

    

    public void rotate(int[] nums, int k) { //k~rotate by 
        int n = nums.length;
        k = k % n;
        rev(nums, 0, n - 1);
        rev(nums, 0, k - 1);
        rev(nums, k, n - 1);
    }
    
}
