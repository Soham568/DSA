class Solution {
    public int maxSubArray(int[] nums) {
        int bestEnding = nums[0];
        int ans = nums[0];
        for(int i = 1;i<nums.length;i++){
            int a = bestEnding + nums[i];
            bestEnding = Math.max(a,nums[i]);
            ans = Math.max(ans,bestEnding);
        }
        return ans;
    }
}