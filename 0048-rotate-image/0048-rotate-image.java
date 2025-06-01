class Solution {
    public void rotate(int[][] matrix) {

        //step 1.transpose
       int row = matrix.length;
       int col = matrix[0].length;
      for(int i=0; i<row; i++){
        for(int j=i+1; j<col; j++){
          int temp = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = temp;
        }
      
    
      }
        revEachRow(matrix,row, col);
    }

//step.2 Rev each row
    public static void revEachRow(int arr[][], int row ,int col){
        int n = arr.length;
        for(int i=0; i<row; i++){
            for(int j=0; j<arr.length/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-1-j];
                arr[i][n-1-j] = temp;
            }
        }

        
    }
    
 

}