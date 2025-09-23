class Solution {
    public int findDuplicate(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            int c=0;
            for(int num:nums){
                if(num<=m){
                    c++;
                }
            }if(c<=m){
                l=m+1;
            }else{
                r= m-1;
            }
        }return l;   
    }
}