class Solution {
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public void moveZeroes(int[] nums) {
        int j=-1;
         for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                j=i;
                break;
            }
         }
         for(int i=j+1; i<nums.length; i++){
            if(j==-1){
                return;
            }
            if(nums[i]!=0){
                swap(nums,i,j);
                j++;
            }
         }
        
    }
}