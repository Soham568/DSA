class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length - 1;
        int[] ans = new int[nums.length];
        int n = nums.length - 1;
        while(n>=0){
            int s1 = nums[left] * nums[left];
            int s2 = nums[right] * nums[right];
            if(s1>=s2){
                ans[n] = s1;
                left++;
            }else{
                ans[n] = s2;
                right--;
            }
            n--;
        }
        return ans;
    }
}