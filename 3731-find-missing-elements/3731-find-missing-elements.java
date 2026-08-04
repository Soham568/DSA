class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int max = 0;
        int min =10000;
        for(int i : nums){
            max = Math.max(max,i);
            min = Math.min(min,i);
        }
        
        boolean[] original = new boolean[max - min +1];
        for (int i : nums) {
            original[i-min] = true;
        }
        for (int i=0;i<original.length;i++) {
            if (!original[i]) {
                ans.add(min+i);
            }
        }
        return ans;
    }
}