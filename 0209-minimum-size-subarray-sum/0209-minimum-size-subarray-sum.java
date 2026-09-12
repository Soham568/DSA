class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = nums[0];
        if(sum>=target) return 1;
        if(nums.length<=1)return 0;
        int left = 0,right = 1;
        sum+= nums[right];
        int sLen = Integer.MAX_VALUE;
        while(right<nums.length && left<=right){
            if(sum>=target  ){
                sLen = Math.min(sLen,(right - left + 1));
                sum -= nums[left];
                left++;
            }
            if(sum<target){
                if(right == nums.length-1)break;
                right++;
                sum+= nums[right];
            }
        }
        if(sLen<Integer.MAX_VALUE)return sLen;
        else return 0;
    }
}