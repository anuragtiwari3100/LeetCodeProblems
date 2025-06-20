class Solution {

/**
       //only for +ve no
    public int majorityElement(int[]arr ) {
           int n = arr.length;
       int maxEle =arr[0];

       for(int x: arr){
           maxEle = Math.max(maxEle, x);
       }

       int res[] = new int[maxEle+1];

    
    for(int i=0; i<n; i++){
         res[arr[i]]++;
    }


     int cnt =0;
     int ans = -1;
    
    for(int x=0; x<res.length; x++){
        if(res[x]>cnt){
            cnt = res[x];
            ans = x;
        }
    
    }
  return  ans;
    }
 */

    public int majorityElement(int[]arr ) {
        int  n = arr.length;
        HashMap<Integer,Integer> map = new  HashMap<>();
        for(int x : arr){
            map.put(x,map.getOrDefault(x,0)+1);
        }
    
          int res = arr[0];
          int  maxFreq = 0;
        for(int key : map.keySet()){
            int value = map.get(key);
            if(value > maxFreq || (value == maxFreq && res < key)){
                maxFreq = value;
                res = key;
            }
        }
        return  res;
    }

}