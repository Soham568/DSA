class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int n = nums.length;
        int sum = 0;
        int ans = 0;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
            int rem = sum%k;
            if(rem<0)rem+=k;
            int freq = map.getOrDefault(rem,0);
            ans+=freq;
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        return ans;
    }
}