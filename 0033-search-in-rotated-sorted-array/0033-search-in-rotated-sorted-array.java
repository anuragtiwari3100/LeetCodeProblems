class Solution {
    public int search(int[]  arr, int tar) {
      int si=0; 
      int ei=arr.length-1;
      while(si<=ei){
        int mid =si+(ei-si)/2;
         if(arr[mid] ==  tar){
            return mid;
         }
         if(arr[si]<= arr[mid]){ //left part is soerted
            if(arr[si]<=tar && tar<=arr[mid]){
                  ei= mid-1;
            }else{  
                  si = mid+1;
            } 

         }else{   //right part  is sorted
              if(arr[mid]<=arr[ei]){
                if(arr[mid]<=tar &&  tar<=arr[ei]){
                    si =si+1;
                }else{
                    ei= mid-1;
                }
              }
         }
      }
         return  -1;
    }
    }

       

