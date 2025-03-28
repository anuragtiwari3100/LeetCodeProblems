class Solution {
    public int majorityElement(int[] nums) {
/**     //App1
          HashMap<Integer,Integer> map = new HashMap<>();
        for(int val :nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int maxFreq =0;
        int maxFreqElement = -1;
    for(HashMap.Entry<Integer,Integer> entry :map.entrySet()){
           if(entry.getValue()>maxFreq){
            maxFreq =entry.getValue();
        maxFreqElement=entry.getKey();
           }
        }
        return maxFreqElement; 
 */
        /**  App2
            for(int i=0; i<nums.length; i++){
        int freqCount =0;
        for(int j=0; j<nums.length; j++){
            if(nums[i] == nums[j]){
            freqCount++; 
            }
        }
        if(freqCount > nums.length/2 ){
            return nums[i];
        }
    }
        return -1;  
      */  
   Arrays.sort(nums);
   int freq =1 ; 
   int ans = nums[0];
   for(int i=1; i<nums.length; i++){
    if(nums[i]== nums[i-1]){
        freq ++;
    }else{
        freq =1;
        ans = nums[i];
    }
    if(freq > nums.length/2){
        return nums[i];
    }
   }

return nums[0];
    }
}