class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int minSum = nums[0];
        int maxSum = nums[0];
        int ans = nums[0];
        int arrSum = nums[0];
        int minAns = nums[0];
        for(int i = 1;i<nums.length;i++){
            arrSum += nums[i];
            maxSum = Math.max(maxSum+nums[i],nums[i]);
            minSum = Math.min(minSum+nums[i],nums[i]);
            ans = Math.max(ans,maxSum);
            minAns = Math.min(minAns,minSum);
        }
        if (ans<0) return ans;
        ans = Math.max(ans,arrSum-minAns);
        return ans;
    }
}