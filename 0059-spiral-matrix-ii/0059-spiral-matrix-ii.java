class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        if (n == 0) {
            return matrix;
        }
        int row = 0;
        int rend = n - 1;
        int col = 0;
        int cend = n - 1;
        int num = 1;
        while (row <= rend && col <= cend) {
            for (int i = col; i <= cend; i++) {
                matrix[row][i] = num++;
            }
            row++;
            for (int i = row; i <= rend; i++) {
                matrix[i][cend] = num++;
            }
            cend--;
            for (int i = cend; i >= col; i--) {
                if (row <= rend) 
                    matrix[rend][i] = num++;
            }
            rend--;
            for (int i = rend; i >= row; i--) {
                if (col <= cend) 
                    matrix[i][col] = num++;
            }
            col++;
        }
        return matrix;
    }
}