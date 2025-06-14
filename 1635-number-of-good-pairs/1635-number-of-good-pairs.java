class Solution {
    public int numIdenticalPairs(int[] nums) {
                



         int cnt =0;
    HashMap<Integer, Integer> freqMap =  new HashMap<>();
    for( int num : nums){
        if( freqMap.containsKey(num)){
            cnt += freqMap.get(num);
        }
    freqMap.put(num, freqMap.getOrDefault(num, 0)+1);         
    }
  return  cnt;
    }
}