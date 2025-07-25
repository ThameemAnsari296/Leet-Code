class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix.length == 0) {
            return list;
        }
        int row = 0;
        int rend = matrix.length - 1;
        int col = 0;
        int cend = matrix[0].length - 1;
        while (row <= rend && col <= cend) {
            for (int i = col; i <= cend; i++) {
                list.add(matrix[row][i]);
            }
            row++;
            for (int i = row; i <= rend; i++) {
                list.add(matrix[i][cend]);
            }
            cend--;
            if (row <= rend) {
                for (int i = cend; i >= col; i--) {
                    list.add(matrix[rend][i]);
                }
            }
            rend--;
            if (col <= cend) {
                for (int i = rend; i >= row; i--) {
                    list.add(matrix[i][col]);
                }
            }
            col++;

        }
        return (list);
    }
}
