class Solution {
    public int majorityElement(int[] nums) {
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
    }
   
}