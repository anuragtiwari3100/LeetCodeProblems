class Solution {
       
       //apprach 1
    public void sortColors2(int[] nums) {
      int cnt0=0, cnt1=0 , cnt2=0;
          for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                cnt0++;
            }else if(nums[i] == 1){
                cnt1++;
            }else{
                cnt2++;
            }
          }


          for(int i=0; i<cnt0; i++){
            nums[i] =0;
          }
          for(int i=cnt0; i<cnt0+cnt1; i++){
            nums[i] =1;
          }
          for(int i=cnt0+cnt1; i<nums.length; i++){
            nums[i] =2;
          }
    }


    public void swap(int arr[], int num1, int num2){
        int temp = arr[num1];
          arr[num1] = arr[num2];
          arr[num2] =  temp;
    }

    //apprach2
    public void sortColors(int[] nums) {
        int n = nums.length;
     int  low =0;
      int mid =0;
       int high =  n-1;
       while(mid<=high){
        if(nums[mid] == 0){
             swap(nums,low,mid);
             low ++;
             mid++;
        }else if(nums[mid] == 1){
            mid ++;
        }else{
            swap(nums,mid, high);
            high --;
        }
       }
    }
 
   
  
  
  
  
    }