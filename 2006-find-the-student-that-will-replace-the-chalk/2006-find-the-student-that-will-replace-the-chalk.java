class Solution {

/**
       public int chalkReplacer(int[] chalk, int k) {
      int sum =0;
    for(int i=0; i<chalk.length; i++){
      sum += chalk[i];
    }

    int  remainingchalks = k % sum;

    for(int i=0; i<chalk.length; i++){
     if(remainingchalks < chalk[i]){
      return  i;
     }
    remainingchalks -=  chalk[i];
    }
    return  -1;
    }
 */

  public  int  ceil(long arr[], int remining){
       int  n = arr.length;
        int si = 0;
        int ei = n-1;
        int res =0;
         while(si<=ei){
       int  mid =  si +(ei-si)/2;
          if(arr[mid] == remining){
            return mid+1;
          }else if(arr[mid]<remining){
            si = mid+1;
          }else{
           res = mid;
             ei = mid -1;
          }
         }
    return res;
  }

 public int chalkReplacer(int[] chalk, int k) { 
      int n = chalk.length;
     long prefixSum[] = new long[n];
    prefixSum[0]  = chalk[0];
      for(int i=1; i<n; i++){
        prefixSum[i] = prefixSum[i-1]+chalk[i];
      }

    long sum = prefixSum[n-1];
      int  remaining =(int )( k % sum);
    return  ceil(prefixSum,remaining);

 }

}