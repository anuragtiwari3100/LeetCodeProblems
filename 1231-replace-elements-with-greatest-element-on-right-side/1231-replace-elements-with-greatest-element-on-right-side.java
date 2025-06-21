class Solution {
    public int[] replaceElements(int[] arr) {
         int n =  arr.length;
         int maxRight = -1;
          for(int i=n-1; i>=0; i--){
            int  tempLoc = arr[i];
            arr[i] = maxRight;
            maxRight = Math.max(tempLoc,maxRight);
          }
        return arr;
    }
}