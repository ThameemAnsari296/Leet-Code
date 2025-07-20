class Solution {
    public int maxSubArray(int[] nums) {
        int temp = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int a = temp + nums[i];
            if (nums[i] > a) {
                temp=nums[i];
            }else{
                temp=a;
            }max=Math.max(temp,max);
        }return max;
    }
}
