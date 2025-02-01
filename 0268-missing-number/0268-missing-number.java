class Solution {
      public static int missingNumber(int arr[]) {   
        int N = arr.length;    
        long sum = (N * (N + 1)) / 2;
        int tempSum = 0;
        for (int i = 0; i < arr.length; i++) {
            tempSum += arr[i];
        }
        return (int)sum - tempSum;
    }
}




