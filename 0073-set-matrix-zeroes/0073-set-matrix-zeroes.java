class Solution {

    
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        int rowArr[] =new int [row];
        int columnArr[] = new int[column];

        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
             if(matrix[i][j] == 0){
                rowArr[i] = 1;
                columnArr[j] = 1;
             }
            }
        }
        
        for(int i=0; i<row; i++){
            for(int j=0; j<column; j++){
                if(rowArr[i] !=0 || columnArr[j] !=0){
                   matrix[i][j]=0; 
                }
            }
        }
    }



}