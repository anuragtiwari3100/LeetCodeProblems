class Solution {


    public int[] corpFlightBookings(int[][] arr, int n) {
       int ansArr[] = new int[n];
    for(int newArr[] : arr){
        int start  = newArr[0];
        int end = newArr[1];
        int seats = newArr[2];
        
        for(int i=start-1; i<end; i++){
           ansArr[i] += seats;
        }
    }
      return  ansArr;
    }
    


}