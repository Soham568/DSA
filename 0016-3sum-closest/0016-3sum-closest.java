class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = Integer.MAX_VALUE;
        int maxDiffer = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-2; i++) {
            if(i>0 && nums[i]==nums[i-1])continue;
            int j = i+1;
            int k = nums.length-1;
            while (j<k) {
                int sum = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(sum-target);
                if(diff<maxDiffer){
                    maxDiffer = diff;
                    ans = sum;
                }
                if(sum>target)k--;
                else if(sum<target)j++;
                else return sum;
            }
        }
        return ans;
    }
}