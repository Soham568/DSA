class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0;
        int[] freq = new int[2];
        int maxLen = 0;
        for(int right = 0;right<nums.length;right++){
            freq[nums[right]]++;
            while(freq[0]>k){
                freq[nums[left]]--;
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}