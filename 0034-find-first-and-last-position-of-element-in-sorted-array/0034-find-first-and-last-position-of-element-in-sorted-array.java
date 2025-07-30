class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        while(i<nums.length && nums[i]!=target){
            i++;
        }int ans[]={-1,-1};
        if(i==nums.length)return ans;
        int s=i;
        i=nums.length-1;
        while(i>=0 && nums[i]!=target){
            i--;
        }int e=i;
        ans[0]=s;
        ans[1]=e;
        return ans;   
    }
}