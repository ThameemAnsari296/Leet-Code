class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int [] mini =  new int[m];
        for(int i=0;i<m;i++){
            int min= mat[i][0];
            for(int j=1;j<n;j++){
                if(mat[i][j]<min){
                    min=mat[i][j];
                }
            }mini[i]=min;
        }
        int[]maxi = new int [n];
        for(int j =0; j < n;j++){
            int  max = mat[0][j];
            for(int i = 1;i<m;i++){
                if(mat[i][j]>max){
                    max=mat[i][j];
                }
            }maxi[j]=max;
        }List<Integer> arr=new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==mini[i] && mat[i][j]==maxi[j]){
                    arr.add(mat[i][j]);
                }
            }
        }return arr;
    }
}