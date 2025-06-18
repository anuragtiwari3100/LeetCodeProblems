class Solution {

                            public int[] twoSum(int[] nums, int target) {
        /**             int n = nums.length;
                    for(int i=0; i<n; i++){
                        for(int j=i+1; j<n; j++){
                        if((nums[i]+nums[j] ) == target){
                            return new int[] {i,j};
                        }
                        }
                    }
                    

                    return  new int[]{-1,-1};
                
  */

   HashMap<Integer,Integer> map = new HashMap<>();
   int resArr[] = new int[]{-1,-1};
   int n = nums.length;
   for(int i=0; i<n; i++){
       int num = nums[i];
       int moreNeeded =   target - num;
       if(map.containsKey(moreNeeded)){
          resArr[0] = map.get(moreNeeded);
          resArr[1] = i;  
       }
       else{
        map.put(nums[i],i);
       }
   }

   return resArr;

  }
}