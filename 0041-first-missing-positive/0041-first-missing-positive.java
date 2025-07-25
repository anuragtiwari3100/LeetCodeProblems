class Solution {
/**
       public boolean isExist(int target , int arr[]){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                return  true;
            }
        }
        return false;
    }
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int limit = n+1;
        for(int i=1; i<limit; i++){
            if(!isExist(i,nums)){
                return i;
            }
        }
        return limit;
    }
 */

  /**
      public int firstMissingPositive(int[] nums) {
    int  n = nums.length;
    int limit = n+1;
    HashSet<Integer> set  = new HashSet<>();

    for(int x : nums){
        set.add(x);
    }

    for(int i=1; i<limit; i++){
        if(!set.contains(i)){
            return  i;
        }
    }
    return limit;
 }
   */

  public int firstMissingPositive(int[] arr) {
      int n = arr.length;
   int limit = n+1;
   for(int i=0; i<n; i++){
      if(arr[i]<=0 || arr[i]>=limit){
          arr[i]  = n+1;
      }
   }

   //mark visited

   for(int i=0; i<n; i++){
    int element =  Math.abs(arr[i]);
    
   if(element == limit){
     continue;
   }
   int seat = element -1;
    if(arr[seat]>0){
        arr[seat] = - arr[seat];
    }

   }

    for(int i=0; i<n; i++){
          if(arr[i]>0){
            return  i+1;
          }
        }

  return (n+1);

 }

}