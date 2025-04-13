class Solution {
    public void reverseArr(int arr[], int start , int end){
    
           while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
    }
    public void nextPermutation(int[] nums) {
        int n= nums.length;
        int index = -1;
         
         for(int i=n-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                index =i;
                break;
            }
         }
         if(index == -1){
            reverseArr(nums,0,n-1);
            return;
         }

         for(int j=n-1; j>=0; j--){
            if(nums[j]>nums[index]){
                int temp= nums[j];
                nums[j] = nums[index];
                nums[index] =temp;
                break;
            }
         }
                 reverseArr(nums,index+1,n-1);
    }
}