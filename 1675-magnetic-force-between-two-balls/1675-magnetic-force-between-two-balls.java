class Solution {

    public boolean  isAllocationPossoble(int minDis , int position[], int m ){
      int  ballsPlced = 1;
      int lastPos = position[0];
      for(int i=1; i<position.length; i++){
         if(position[i]- lastPos >= minDis ){
         ballsPlced++;
         lastPos = position[i];
         }if(ballsPlced >=m ){
          return  true;
         }
      }
      return  false;
    }

//  Magnetic_Force_Between_Two_Balls
    public int maxDistance(int[] position, int m) {
      if(m > position.length){
        return -1;
      }
       Arrays.sort(position);
        int n =  position.length;
        int start = 1;
        int end = position[n-1]-position[0];
         int ans =0;
         while(start <= end){
             int mid = start + (end-start)/2;
             if(isAllocationPossoble(mid,position,m)){
              ans = mid;
              start = mid+1;
             }else{
              end = mid-1;
             }
         }
         return  ans;
        
    }
}