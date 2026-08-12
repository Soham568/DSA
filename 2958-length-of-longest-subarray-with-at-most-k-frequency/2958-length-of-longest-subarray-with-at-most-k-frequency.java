class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        if(nums.length == 1) return 1;
        int maxCount = 0;
        int left = 0,right = 0;
        int count = 0;
        HashMap <Integer,Integer> map = new HashMap<>();
        while (right<nums.length) {
            if(map.getOrDefault(nums[right],0)+1>k){
                while (map.get(nums[right])+1>k) {
                    map.put(nums[left],map.get(nums[left])-1);
                    left++;
                    count--;
                }
            }
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            right++;
            count++;
            maxCount = Math.max(count,maxCount);
        }
        return maxCount;
    }
}