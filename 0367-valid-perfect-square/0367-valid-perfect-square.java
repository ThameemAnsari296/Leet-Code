class Solution {
    public boolean isPerfectSquare(int num) {
        int left =1;
        int right =num;
        while (left<=right){
            int mid =(left+right)/2;
            long midsquare =(long)mid*mid;
            if(midsquare==num) return true;
            else if (midsquare>num) right =mid-1;
            else{
                left =mid+1;
            }
        }return false;
    }
}