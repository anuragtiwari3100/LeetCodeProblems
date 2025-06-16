class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        
    int  row = arr.length;
        int col = arr[0].length;
  System.out.println("roe is "+row+"col is "+col);
        for(int i=0; i<row; i++){
          for(int j=0; j<col; j++){
            if(arr[i][j] == target){
              return  true;
            }
          }
        }

 return false;  

    }





}