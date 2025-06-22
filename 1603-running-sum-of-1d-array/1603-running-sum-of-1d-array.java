class Solution {
    public int[] runningSum(int[] arr) {

        // int n = nums.length;
        // ansArr[0] = nums[0];
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //       ansArr[j] =ansArr[j-1] + nums[j];
        //     }
        // }
        // return ansArr; int currSum =0;
  
    
        for (int i = 1; i < arr.length; i++) {
            arr[i] += arr[i - 1]; 
        }
        return arr;
    }

    }
