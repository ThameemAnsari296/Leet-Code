class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
      int rows = mat.length;
      int col = mat[0].length;
      if((rows*col)!=(r*c))return mat;
      int [][] output =new int[r][c];
      int or =0;
      int oc=0;
      for(int i=0;i<rows;i++){
        for(int j=0;j<col;j++){
            output[or][oc]=mat[i][j];
            oc++;
            if(oc==c){
                oc=0;
                or++;
            }
        }
      }return output;
    }
}