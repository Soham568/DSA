class Solution {
    public int maxProduct(int[] nums) {
        int bestEnding = nums[0];
        int minEnding = nums[0];
        int ans = nums[0];
        for(int i = 1;i<nums.length;i++){
            int a = bestEnding * nums[i];
            int b = minEnding * nums[i];
            bestEnding = Math.max(b, Math.max(a,nums[i]));
            minEnding = Math.min(b, Math.min(a,nums[i]));
            ans = Math.max(ans,bestEnding);
        }
        return ans;
    }
}