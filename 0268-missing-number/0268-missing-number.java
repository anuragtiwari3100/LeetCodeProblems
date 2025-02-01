class Solution {




      public static int missingNumber(int arr[]) {   //TC => O(n) && SC = O(1)
        int N = arr.length;    //  we know size  will currSize+1
        int sum = (N * (N + 1)) / 2;
        int tempSum = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSum += arr[i];
        }
        return sum - tempSum;
    }




}




