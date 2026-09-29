class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int z = 0,o = 0;
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == 0) z++;
            else o++;
            int diff = z - o;
            if(diff == 0) ans = Math.max(ans,i+1);
            if(map.containsKey(diff)) ans = Math.max(ans,i - map.get(diff));
            else map.put(diff,i);
        }
        return ans;
    }
}