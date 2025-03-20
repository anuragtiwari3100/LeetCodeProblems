class Solution {
/**
                        public int[] twoSum1(int[] nums, int target) {
                                int sum =0;
                                for(int i=0; i<nums.length; i++){
                                    for(int j=i+1; j<nums.length; j++){
                                
                                    if(nums[i]+nums[j] == target){
                                        return new int[]{i,j};
                                    }  
                                    }
                                }
                                return new int[]{-1,-1};
                        }
 */
/*
                        public static int []  twoSum(int arr[], int target){
                        int res[] = new int[2];
                        res[0] =-1;
                        res[1] =-1;
                        for(int i=0; i<arr.length; i++){
                            for(int j=i+1; j<arr.length; j++){
                                if( arr[i]+arr[j] == target ){
                                    res[0] =i;
                                    res[1]=j;
                                    
                                    return  res;
                                }
                            }
                        }
                        return res;
                        }
 */


          public int[] twoSum(int[] nums, int target) {
          
            for(int i=0; i<nums.length; i++){
                for(int j=0; j<nums.length; j++){
              if(i == j){
                continue;
              }
                  if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                  }  
                }
            }
            return new int[]{-1,-1};
    }
 

 public int[] twoSum3(int[] nums, int target) {
  HashMap<Integer,Integer> map = new HashMap<>();
  int  resArr[]= new int[2];
    resArr[0]=resArr[1] = -1;
    for(int i=0; i<nums.length; i++){
       int num = nums[i];
        int moreNeeded =target-num;
        if(map.containsKey(moreNeeded)){
           resArr[0] = map.get(moreNeeded);
           resArr[1] = i;
            return resArr;
        }
        map.put(nums[i],i);
    }   
     return new int[]{-1,-1};
 }
}