class Solution {
    public int[] sumZero(int n) {
    int [] sum = new int[n];
    for(int i=0;i<n;i++)
    sum[i]=i*2-n+1;
    return sum;
    }
}