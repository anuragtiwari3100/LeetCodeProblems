class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
    ArrayList<Integer>  list = new ArrayList<>();
      int s_row =0;
      int e_row = matrix.length-1;
      int s_col = 0;
      int e_col =matrix[0].length-1;
      while(s_row <= e_row && s_col <= e_col){

        //top
          for(int i=s_col; i<=e_col; i++){
           list.add(matrix[s_row][i]);
          }

          //right
          for(int i=s_row+1; i<=e_row; i++){
            list.add(matrix[i][e_col]);
          }

          //bottom
          for(int i=e_col-1; i>=s_col; i--){
            if(s_row == e_row){
            break;
            }
            list.add(matrix[e_row][i]);
          }

          //right
          for(int i=e_row-1; i>s_row; i--){
            if(s_col == e_col){
                break;
            }
            list.add(matrix[i][s_col]);
          }

          s_row ++;
          e_row --;
          s_col ++;
          e_col --;
      } 
      return list; 
    }
}